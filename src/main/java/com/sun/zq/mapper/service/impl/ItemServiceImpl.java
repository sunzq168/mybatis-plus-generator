package com.sun.zq.mapper.service.impl;

import com.sun.zq.mapper.entity.Item;
import com.sun.zq.mapper.mapper.ItemMapper;
import com.sun.zq.mapper.service.ItemService;
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
public class ItemServiceImpl extends ServiceImpl<ItemMapper, Item> implements ItemService {

}
