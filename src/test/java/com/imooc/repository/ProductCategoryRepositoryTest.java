package com.imooc.repository;

import com.imooc.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository productCategoryRepository;


    @Test
    public void findOne() {
        ProductCategory productCategory=productCategoryRepository.findById(1).get();
        System.out.println(productCategory.toString());
    }

    @Test
    public void  saveTest(){
        ProductCategory productCategory=new ProductCategory();
        productCategory.setCategoryName("测试插入");
        productCategory.setCategoryType(4);
        productCategoryRepository.save(productCategory);
    }

    @Test
    public void  updateTest(){
        ProductCategory productCategory=new ProductCategory();
        productCategory.setCategoryId(2);
        productCategory.setCategoryName("测试插入改");
        productCategory.setCategoryType(3);
        productCategoryRepository.save(productCategory);
    }

    @Test
    public void test(){
        List<Integer> list= Arrays.asList(1,2,3);
        List<ProductCategory> byCategoryTypeIn = productCategoryRepository.findByCategoryTypeIn(list);
        System.out.println(byCategoryTypeIn);
        Assert.assertNotEquals(0,byCategoryTypeIn);
    }

}