package com.betty.service;

import com.betty.entity.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @auther r20673
 * @date 2020/6/21
 */
@Component
public class DeptClientFallBackFactory implements FallbackFactory<DeptClientService> {
    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public List<Dept> findAll() {
                return null;
            }

            @Override
            public Boolean insert(Dept record) {
                return null;
            }

            @Override
            public Dept selectByPrimaryKey(Integer id) {
                return new Dept(id, "该ID：" + id + "没有没有对应的信息,null--@HystrixCommand", "no this database in MySQL");
            }
        };
    }
}
