package com.dao;

import com.domain.Product;
import jdbc.config.JDBCUtils;

import java.util.List;

public class ProductDao {
    private JDBCUtils utils=new JDBCUtils();

    public void saveProduct(Product product){
        String sql="insert into product(pname,price,description,imgs)values(?,?,?,?)";
        Object[] params={product.getPname(),product.getPrice(),product.getDescription(),product.getImgs()};
        int row=utils.executeUpdate(sql,params);
        System.out.println(row+"件产品成功保存");
    }
    public List<Product>getProducts(){
        String sql="select * from product";
        Object[] params=null;
        List<Product> products= (List<Product>) utils.findByType(sql,Product.class,params);
        return products;
    }
    public void deleteProduct(int pid){
        String sql="delete from product where pid=?";
        Object[] params={pid};
        int row=utils.executeUpdate(sql,params);
        System.out.println("删除成功");
    }



}
