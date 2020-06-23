package com.betty.controller;

import com.betty.service.DeptService;
import com.betty.entity.Dept;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/dept")
public class DeptController {
    @Autowired
    DeptService deptService;

    @GetMapping(value = "/get/{id}")
    @HystrixCommand(fallbackMethod = "processHystrix_Get")
    public Dept getDeptById(@PathVariable("id") Integer id) throws Exception {

        Dept dept = deptService.selectByPrimaryKey(id);
        if (dept == null){
            throw  new Exception("没有该ID信息");
        }
        return deptService.selectByPrimaryKey(id);
    }

    public Dept processHystrix_Get(@PathVariable("id") Integer id) {
        return new Dept(id, "该ID：" + id + "没有没有对应的信息,null--@HystrixCommand", "no this database in MySQL");
    }
}
