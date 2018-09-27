package com.service;

import com.dao.ProductDao;
import com.domain.Product;
import org.junit.Test;
import java.math.BigDecimal;

import static org.junit.Assert.*;

public class ProductHanderTest {

    @Test
    public void hander() {
        ProductDao dao=new ProductDao();
//        Product p=new Product("asdasdf",988,"skdfalskdjf","lkjfslkd");
//        System.out.println(p);
//        dao.saveProduct(p);
        dao.deleteProduct(16);

    }
}