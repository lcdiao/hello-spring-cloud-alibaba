package cn.lcdiao.spring.cloud.alibaba.consumer.controller;

import cn.lcdiao.spring.cloud.alibaba.consumer.service.EchoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author diao
 * @date 2019/8/28
 */

@RestController
public class TestEchoController {

    @Resource
    private EchoService echoService;

    @GetMapping(value = "/feign/echo/{str}")
    public String echo(@PathVariable("str") String str) {
        return echoService.echo(str);
    }

    @GetMapping(value = "/lb")
    public String lb() {
        return echoService.lb();
    }
}
