package com.betty.service;

import com.betty.entity.Dept;
import java.util.List;

public interface DeptService {
    List<Dept> findAll();
    Boolean insert(Dept record);
    Dept selectByPrimaryKey(Integer deptNo);

}
