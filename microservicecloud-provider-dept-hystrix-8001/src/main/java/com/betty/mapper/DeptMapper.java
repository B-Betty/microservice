package com.betty.mapper;
import com.betty.entity.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface DeptMapper {
    List<Dept> findAll();

//    int deleteByPrimaryKey(Integer deptNo);

    Boolean insert(Dept record);

//    Boolean insertSelective(Dept record);

    Dept selectByPrimaryKey(Integer deptNo);

//    int updateByPrimaryKeySelective(Dept record);
//
//    int updateByPrimaryKey(Dept record);
}