package cn.lcdiao.spring.cloud.alibaba.consumer.service;

import cn.lcdiao.spring.cloud.alibaba.consumer.service.fallback.EchoServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author diao
 * @date 2019/8/28
 */
//指定调用哪个服务(nacos上的service-provider)
@FeignClient(name = "service-provider",fallback = EchoServiceFallback.class)
public interface EchoService {

    @GetMapping(value = "/echo/{string}")
    public String echo(@PathVariable("string") String string);

    @GetMapping(value = "/lb")
    public String lb();
}
