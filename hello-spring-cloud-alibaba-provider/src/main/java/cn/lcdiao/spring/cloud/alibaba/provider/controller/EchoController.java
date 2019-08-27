package cn.lcdiao.spring.cloud.alibaba.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author diao
 * @date 2019/8/27
 */
@RestController
public class EchoController {

    @GetMapping(value = "/echo/{string}")
    public String echo(@PathVariable("string") String string) {

        return "Hello Nacos Provider:" + string;
    }
}
