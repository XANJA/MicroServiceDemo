package com.nja.app.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Robert.XU
 * @email <xutao@bjnja.com>
 * @date 2018/1/31 0031 下午 02:57
 * @description
 */
@RestController
public class TestController {
    @Value("${hello}")
    private String hello;

    @RequestMapping("/hello")
    public String from() {
        return this.hello;
    }
}
