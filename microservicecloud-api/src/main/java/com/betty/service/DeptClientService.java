package com.betty.service;

import com.betty.entity.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * @auther r20673
 * @date 2020/6/19
 */
//@FeignClient(value = "MICROSERVICECLOUD-DEPT")  //

@FeignClient(value = "MICROSERVICECLOUD-DEPT", fallbackFactory = DeptClientFallBackFactory.class)  //服务降级
public interface DeptClientService {
    @PostMapping(value = "/dept/findAll")
    List<Dept> findAll();

    @GetMapping(value = "/dept/insert")
    Boolean insert(Dept record);

    @GetMapping(value = "/dept/get/{id}")
    Dept selectByPrimaryKey(@PathVariable("id") Integer id);
}
