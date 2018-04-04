package com.zhibo.stream.kafka.service;

import com.zhibo.stream.kafka.channel.ShopChannel;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
public class ShopService {

    @Resource(name = ShopChannel.SHOP_OUTPUT)
    private MessageChannel messageChannel;
    @GetMapping("/success")
    public String send(String context)
    {
        boolean sendsusees=messageChannel.send(MessageBuilder.withPayload(context).build());
        return sendsusees ? "发送成功" : "发送失败";
    }

    @StreamListener(ShopChannel.SHOP_INPUT)
    public void receive(Message<String> message){
        System.out.println(message.getPayload());
    }
}
