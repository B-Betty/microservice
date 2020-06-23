package com.betty.controller;

import com.betty.service.DeptService;
import com.betty.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(value = "/dept")
public class DeptController {
    @Autowired
    DeptService deptService;

    @GetMapping("/findAll")
    public List<Dept> findAll(){
        return deptService.findAll();
    }

    @GetMapping(value = "/get/{id}")
    public Dept getDeptById(@PathVariable("id") Integer id){
        return deptService.selectByPrimaryKey(id);
    }

    @PostMapping(value = "/insert")
    public Boolean insertDept(@RequestBody Dept dept){
        return deptService.insert(dept);
    }

    /**
     * 服务的发现
     */
    @Autowired
    DiscoveryClient discoveryClient;
    @RequestMapping(value = "/discovery", method = RequestMethod.GET)
    public Object discovery()
    {
        List<String> list = discoveryClient.getServices();
        System.out.println("**********" + list);

        List<ServiceInstance> srvList = discoveryClient.getInstances("MICROSERVICECLOUD-PROVIDER-DEPT-8001");
        for (ServiceInstance element : srvList) {
            System.out.println(element.getServiceId() + "\t" + element.getHost() + "\t" + element.getPort() + "\t"
                    + element.getUri());
        }
        return this.discoveryClient;
    }

}
