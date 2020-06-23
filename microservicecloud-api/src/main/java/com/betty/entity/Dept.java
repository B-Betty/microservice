package com.betty.entity;

import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * lombok的使用：
 *  1、下载lombok插件
 *  2、导入POM包
 *  3、使用注解
 */
//@Data //get、set、tostring、hashcode
//@NoArgsConstructor //空参构造器
//@AllArgsConstructor //全参构造器
@Accessors(chain = true)
public class Dept implements Serializable {  //必须序列化
    private Integer deptNo;
    private String deptName;
    private String dbSource; //来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库
    public Dept(String deptName) {
        super();
        this.deptName = deptName;
    }

    public Dept() {
    }

    public Dept(Integer deptNo, String deptName, String dbSource) {
        this.deptNo = deptNo;
        this.deptName = deptName;
        this.dbSource = dbSource;
    }

    public Integer getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(Integer deptNo) {
        this.deptNo = deptNo;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDbSource() {
        return dbSource;
    }

    public void setDbSource(String dbSource) {
        this.dbSource = dbSource;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "deptNo=" + deptNo +
                ", deptName='" + deptName + '\'' +
                ", dbSource='" + dbSource + '\'' +
                '}';
    }
}
