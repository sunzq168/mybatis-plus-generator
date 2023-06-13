package com.sun.zq.mapper.service.impl;

import com.sun.zq.mapper.entity.Dog;
import com.sun.zq.mapper.mapper.DogMapper;
import com.sun.zq.mapper.service.DogService;
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
public class DogServiceImpl extends ServiceImpl<DogMapper, Dog> implements DogService {

}
