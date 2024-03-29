package com.example.sharding_jdbc_demo3.dao;

import com.example.sharding_jdbc_demo3.model.Order;
import com.example.sharding_jdbc_demo3.model.OrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order_1
     *
     * @mbg.generated Wed Oct 13 15:53:10 CST 2021
     */
    long countByExample(OrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order_1
     *
     * @mbg.generated Wed Oct 13 15:53:10 CST 2021
     */
    int deleteByExample(OrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order_1
     *
     * @mbg.generated Wed Oct 13 15:53:10 CST 2021
     */
    int deleteByPrimaryKey(String orderId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order_1
     *
     * @mbg.generated Wed Oct 13 15:53:10 CST 2021
     */
    int insert(Order record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order_1
     *
     * @mbg.generated Wed Oct 13 15:53:10 CST 2021
     */
    int insertSelective(Order record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order_1
     *
     * @mbg.generated Wed Oct 13 15:53:10 CST 2021
     */
    List<Order> selectByExample(OrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order_1
     *
     * @mbg.generated Wed Oct 13 15:53:10 CST 2021
     */
    Order selectByPrimaryKey(String orderId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order_1
     *
     * @mbg.generated Wed Oct 13 15:53:10 CST 2021
     */
    int updateByExampleSelective(@Param("record") Order record, @Param("example") OrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order_1
     *
     * @mbg.generated Wed Oct 13 15:53:10 CST 2021
     */
    int updateByExample(@Param("record") Order record, @Param("example") OrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order_1
     *
     * @mbg.generated Wed Oct 13 15:53:10 CST 2021
     */
    int updateByPrimaryKeySelective(Order record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order_1
     *
     * @mbg.generated Wed Oct 13 15:53:10 CST 2021
     */
    int updateByPrimaryKey(Order record);
}