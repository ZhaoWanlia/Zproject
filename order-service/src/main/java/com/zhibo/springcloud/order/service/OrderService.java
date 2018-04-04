package com.zhibo.springcloud.order.service;

import com.zhibo.springcloud.api.IOrderService;
import com.zhibo.springcloud.dto.OrderDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderService implements IOrderService {
    @GetMapping("/orderId/{orderId}")
    @Override
    public OrderDTO getByOrderId(@PathVariable("orderId") Integer orderId) {
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setOrderId(orderId);
        orderDTO.setOrderName("ID为："+orderId+"的订单");
        return orderDTO;
    }
}
