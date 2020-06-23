package com.betty.cfgbeans;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {
    /**
     * 相当于
     * <bean id="deptService" class="com.wpx.service.impl.DeptServiceImpl">
     *
     * @return 返回要注入的接口
     */
    //	@Bean
//	public DeptService getDeptService(){
//		return new DeptServiceImpl();
//	}

    /**
     * 注入接口
     * @return
     */
    @Bean
    @LoadBalanced //负载均衡 spring cloud ribbon是基于Netfix Ribbon实现的一套客户端  负载均衡工具
    public RestTemplate getRest(){
        return new RestTemplate();
    }
    @Bean
    public IRule myRule(){
        return new RandomRule(); //使用重新选择的随机算法代替默认的轮询算法
    }

}
