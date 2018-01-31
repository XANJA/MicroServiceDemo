package com.nja.producer.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @author Robert.XU
 * @email <xutao@bjnja.com>
 * @date 2018/1/31 0031 下午 02:24
 * @description
 */
@RestController
public class TestController {

    /**
     * @param name
     * @return
     */
    @RequestMapping("/hello")
    public String hello(@RequestParam String name) {
        return "hello "+name+"，this is first message";
    }
}
