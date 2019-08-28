package cn.lcdiao.spring.cloud.alibaba.consumer.service.fallback;

import cn.lcdiao.spring.cloud.alibaba.consumer.service.EchoService;
import org.springframework.stereotype.Component;

/**
 * @author diao
 * @date 2019/8/28
 */
@Component
public class EchoServiceFallback implements EchoService {
    @Override
    public String echo(String string) {
        return "echo fail;触发熔断！！！";
    }

    @Override
    public String lb() {
        return "触发熔断！！！";
    }
}
