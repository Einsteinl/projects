package com.dao;

import com.domain.Product;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ProductDaoTest {

    @Test
    public void saveProduct() {
    }

    @Test
    public void getProducts() {
        ProductDao dao=new ProductDao();
        List<Product> p=dao.getProducts();
        System.out.println(p);
    }
}