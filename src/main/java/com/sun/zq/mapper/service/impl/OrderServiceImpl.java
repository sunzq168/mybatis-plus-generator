package com.sun.zq.mapper.service.impl;

import com.sun.zq.mapper.entity.Order;
import com.sun.zq.mapper.mapper.OrderMapper;
import com.sun.zq.mapper.service.OrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author sunzheng
 * @since 2023-06-13
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

}
