package com.nja.consumer.remote;

import org.springframework.stereotype.Component;

/**
 * 熔断回调方法，负责在熔断触发之后执行。
 * @author Robert.XU
 * @email <xutao@bjnja.com>
 * @date 2018/2/1 0001 上午 09:17
 * @description
 */
@Component
public class HelloRemoteHystrix implements HelloRemote {

    @Override
    public String hello(String name) {
        return "hello" +name+", this messge send failed ";
    }
}
