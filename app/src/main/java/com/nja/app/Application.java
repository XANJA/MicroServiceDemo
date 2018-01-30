package com.nja.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Spring could web程序主入口
 * @author Robert.XU
 * @email <xutao@bjnja.com>
 * @date 2018/1/30 0030 上午 11:23
 * @description
 */
@Configuration//配置控制
@EnableAutoConfiguration//启用自动配置
@ComponentScan(value={"com.nja.app"})//组件扫描
@EnableDiscoveryClient
public class Application {
    public static void main(String[] args) {
        //第一个简单的应用，
        SpringApplication.run(Application.class, args);
    }
}
