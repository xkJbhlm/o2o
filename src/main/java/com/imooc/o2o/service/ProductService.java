package com.imooc.o2o.service;

import com.imooc.o2o.dto.ProductExecution;
import com.imooc.o2o.entity.Product;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.util.List;

public interface ProductService {
    ProductExecution getProductList(Product productCondition,int pageIndex,int pageSize);

    Product getProductById(long productId);

    ProductExecution addProduct(Product product, CommonsMultipartFile thumbnail, List<CommonsMultipartFile> productImgs)
        throws RuntimeException;

    ProductExecution modifyProduct(Product product,CommonsMultipartFile thumbnail,List<CommonsMultipartFile> productImgs)
        throws RuntimeException;

}
