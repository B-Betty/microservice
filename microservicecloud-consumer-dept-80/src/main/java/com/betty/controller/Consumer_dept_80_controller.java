package com.betty.controller;

import com.betty.entity.Dept;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;


@RestController
@RequestMapping("/dept")
public class Consumer_dept_80_controller {
    @Resource
    RestTemplate restTemplate;
//    static final String PROVICE_URL = "http://localhost:8001";
    static final String PROVICE_URL = "http://MICROSERVICECLOUD-DEPT"; //使用微服务名称调用url

    @RequestMapping(value="/add")
    public boolean add(@RequestBody Dept dept){
        return restTemplate.postForObject(PROVICE_URL+"/dept/insert", dept, Boolean.class);
    }

    @RequestMapping(value="/get/{id}")
    public Dept get(@PathVariable("id") Integer id){
        return restTemplate.getForObject(PROVICE_URL+"/dept/get/"+id, Dept.class);
    }
    @SuppressWarnings(value = "unchecked")
    @RequestMapping(value="/list")
    public List<Dept> list(){
        return restTemplate.getForObject(PROVICE_URL+"/dept/findAll", List.class);
    }

    /**
     * 测试provider-dept-8001   @EnableDiscoveryClient 服务发现
     */
    @GetMapping(value = "/discovery")
    public Object discovery(){
        return  restTemplate.getForObject(PROVICE_URL +"/dept/discovery", Object.class);
    }
}
