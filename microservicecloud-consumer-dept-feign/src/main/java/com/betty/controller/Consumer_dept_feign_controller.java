package com.betty.controller;
import com.betty.entity.Dept;
import com.betty.service.DeptClientService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(value = "/dept")
public class Consumer_dept_feign_controller {
    @Resource
    private DeptClientService deptClientService;

    @RequestMapping(value="/add")
    public boolean add(@RequestBody Dept dept){
        return this.deptClientService.insert(dept);
    }

    @RequestMapping(value="/get/{id}")
    public Dept get(@PathVariable("id")Integer id){
        return this.deptClientService.selectByPrimaryKey(id);
    }
    @SuppressWarnings(value = "unchecked")
    @RequestMapping(value="/list")
    public List<Dept> list(){
        return this.deptClientService.findAll();
    }

}
