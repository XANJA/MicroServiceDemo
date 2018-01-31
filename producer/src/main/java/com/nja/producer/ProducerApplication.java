package com.nja.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Robert.XU
 * @email <xutao@bjnja.com>
 * @date 2018/1/31 0031 下午 02:24
 * @description
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ProducerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProducerApplication.class, args);
    }
}
