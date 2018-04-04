package com.zhibo.stream.kafka.channel;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface ShopChannel {
    String SHOP_OUTPUT="shop_output";
    String SHOP_INPUT="shop_input";

    @Output(ShopChannel.SHOP_OUTPUT)
    MessageChannel sendShopMessage();

    @Input(SHOP_INPUT)
    SubscribableChannel recievShopMessage();
}
