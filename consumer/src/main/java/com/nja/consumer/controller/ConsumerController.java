package com.nja.consumer.controller;

import com.nja.consumer.remote.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author Robert.XU
 * @email <xutao@bjnja.com>
 * @date 2018/1/31 0031 下午 02:28
 * @description
 */
@RestController
public class ConsumerController {
    @Autowired
    private HelloRemote helloRemote;

    @RequestMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {
        return helloRemote.hello(name);
    }
}
