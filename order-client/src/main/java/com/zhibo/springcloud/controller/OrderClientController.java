package com.zhibo.springcloud.controller;

import com.zhibo.springcloud.dto.OrderDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderClientController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/orderId/{orderId}")
    public OrderDTO getOrders(@PathVariable("orderId") Integer orderId){
        return restTemplate.getForObject("http://ORDER-SERVICE/orderId/"+orderId,OrderDTO.class);
    }

}
