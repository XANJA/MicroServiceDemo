package com.nja.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Robert.XU
 * @email <xutao@bjnja.com>
 * @date 2018/1/31 0031 上午 10:26
 * @description
 */
@SpringBootApplication
@EnableEurekaServer
public class ClusterApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClusterApplication.class, args);
    }
}
