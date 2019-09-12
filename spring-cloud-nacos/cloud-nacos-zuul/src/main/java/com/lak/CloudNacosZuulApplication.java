package com.lak;

import com.lak.utils.ErrorFilter;
import com.lak.utils.ThrowExceptionFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class CloudNacosZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudNacosZuulApplication.class, args);
        System.out.println("zuul网管启动成功！");
    }

//    @Bean
//    public ErrorFilter errorFilter() {
//        return new ErrorFilter();
//    }

//    @Bean
//    public ThrowExceptionFilter throwExceptionFilter() {
//        return new ThrowExceptionFilter();
//    }

}
