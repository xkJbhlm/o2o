package com.imooc.o2o.dao;

import com.imooc.o2o.entity.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductDao {
    List<Product> queryProductList(@Param("productCondition") Product productCondition,
                                   @Param("rowIndex") int rowIndex,@Param("pageSize") int pageSize);

    int queryProductCount(@Param("productCondition") Product productCondition);

    Product queryProductByProductId(long productId);

    int insertProduct(Product product);

    int updateProduct(Product product);

    int updateProductCategoryToNUll(long productCategoryId);

    int deleteProduct(@Param("productId") long productId,
                      @Param("shopId") long shopId);
}
