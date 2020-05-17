package cn.aurora.service.service.impl;

import cn.aurora.dao.mapper.OrderMapper;
import cn.aurora.dao.pojo.OrderEntity;
import cn.aurora.service.service.OrderService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by pijiang on 2020/5/2.
 */
@SuppressWarnings("all")
@Slf4j
@Transactional
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public PageInfo<OrderEntity> getOrders(int index, int size) {
        PageHelper.startPage(index, size);
        return PageInfo.of(orderMapper.getOrders());
    }

    @Override
    public PageInfo<OrderEntity> getOrdersForScript(int index, int size, OrderEntity entity) {
        PageHelper.startPage(index, size);
        return PageInfo.of(orderMapper.getOrdersForScript(entity));
    }

    @Override
    public PageInfo<OrderEntity> getAll() {
        return PageInfo.of(orderMapper.selectAll());
    }

    @Override
    public int insertOrder(OrderEntity entity) {
        return orderMapper.insert(entity);
    }

}
