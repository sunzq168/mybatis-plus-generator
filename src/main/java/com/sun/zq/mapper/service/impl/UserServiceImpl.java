package com.sun.zq.mapper.service.impl;

import com.sun.zq.mapper.entity.User;
import com.sun.zq.mapper.mapper.UserMapper;
import com.sun.zq.mapper.service.UserService;
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
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
