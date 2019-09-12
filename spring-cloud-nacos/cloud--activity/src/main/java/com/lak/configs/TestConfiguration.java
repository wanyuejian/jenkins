package com.lak.configs;


import com.lak.entity.TestBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfiguration {


    static {
        System.out.println("TestConfiguration容器启动初始化31312。。。");
    }

    {
        System.out.println("TestConfiguration容器启动初始化6666。。。");
    }
    public TestConfiguration() {
        System.out.println("TestConfiguration容器启动初始化。。。");
    }

    @Bean
    public TestBean getTestBean(){
        return new TestBean();
    }
}