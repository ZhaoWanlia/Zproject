package com.zhibo.springcloud.api;

import com.zhibo.springcloud.dto.OrderDTO;
//服务接口
public interface IOrderService {
    OrderDTO getByOrderId(Integer orderId);
}
