package com.imooc.o2o.dao;

import com.imooc.o2o.entity.Shop;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShopDao {
    /*
     *分页查询，条件：店铺名，店铺状态，区域ID，owner
     */
    List<Shop> queryShopList(@Param("shopCondition") Shop shopCondition,
                             @Param("rowIndex")int rowIndex,@Param("pageSize") int pageSize);
    int queryShopCount(@Param("shopCondition") Shop shopCondition);
    /*
     * 通过shopId查询
     * */
    Shop queryByShopId(Long shopId);

    /*
     * 新增店铺
     * */
    int insertShop(Shop shop);

    /*
     *更新店铺
     */

    int updateShop(Shop shop);
}
