package cn.lcdiao.spring.cloud.alibaba.consumer.controller;

import cn.lcdiao.spring.cloud.alibaba.consumer.service.EchoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author diao
 * @date 2019/8/28
 */

//根据配置中心的配置文件动态刷新
@RefreshScope
@RestController
public class TestEchoController {

    @Resource
    private EchoService echoService;

    @Value("${user.name}")
    private String username;

    @GetMapping(value = "/feign/echo/{str}")
    public String echo(@PathVariable("str") String str) {
        return echoService.echo(str);
    }

    @GetMapping(value = "/lb")
    public String lb() {
        return echoService.lb();
    }

    @GetMapping(value = "/feign/echo")
    public String echo() {
        return echoService.echo(username);
    }
}
