package com.imooc.service;

import com.imooc.dataobject.ProductCategory;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CategoryService {
    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> catagoryTypeList);

    ProductCategory save(ProductCategory productCategory);
}
