package com.betty.service.impl;

import com.betty.mapper.DeptMapper;
import com.betty.service.DeptService;
import com.betty.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    DeptMapper deptMapper;

    @Override
    public List<Dept> findAll() {
        List<Dept> result = deptMapper.findAll();
        if (result==null){
            return null;
        }
        return result;
    }

    @Override
    public Boolean insert(Dept record) {
        return deptMapper.insert(record);
    }

    @Override
    public Dept selectByPrimaryKey(Integer deptNo) {
        return deptMapper.selectByPrimaryKey(deptNo);
    }
}
