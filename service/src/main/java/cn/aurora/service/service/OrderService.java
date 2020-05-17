package cn.aurora.service.service;

import cn.aurora.dao.pojo.OrderEntity;
import com.github.pagehelper.PageInfo;

/**
 * Created by pijiang on 2020/5/2.
 */
public interface OrderService  {
    PageInfo<OrderEntity> getOrders(int index, int size);
    PageInfo<OrderEntity> getOrdersForScript(int index, int size, OrderEntity entity);
    PageInfo<OrderEntity> getAll();
    int insertOrder(OrderEntity entity);
}
