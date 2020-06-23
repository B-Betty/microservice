package com.rule;

import com.netflix.loadbalancer.AbstractLoadBalancer;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @auther r20673
 * @date 2020/6/19
 */
@Configuration
public class MySelfRule  {
    @Bean
    public IRule myRule(){
//        return new RandomRule();
        return new RandomIRuleSelf();
    }
}
