package com.repository;

import com.domain.Phone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

@Repository
public class PhoneRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    RowMapper<Phone> rowMapper=new BeanPropertyRowMapper<>(Phone.class);
    public List<Phone> getPhones(){
        final String sql="select pid , pname , price , description , imgs  from product";

        return jdbcTemplate.query(sql,rowMapper);
    }
    public Phone savePhone(Phone phone){
        final String sql = "insert into product (pname , price , description ) values (? , ? , ? )";

        KeyHolder keyHolder = new GeneratedKeyHolder();
        int rows = jdbcTemplate.update(new PreparedStatementCreator() {
            @Override
            public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                PreparedStatement ps = connection.prepareStatement(sql , PreparedStatement.RETURN_GENERATED_KEYS);
                ps.setString(1, phone.getPname());
                ps.setBigDecimal(2, phone.getPrice());
                ps.setString(3 , phone.getDescription());
                return ps;
            }
        } , keyHolder);

        if(rows>0) {
            phone.setPid(keyHolder.getKey().intValue());
            return phone;
        } else {
            return null;
        }
    }
    public Integer deletePhone(int pid){
        final String sql="delete from product where pid=?";
        Object params[]={pid};
        int rows=jdbcTemplate.update(sql,params);
        if(rows>0){
            return rows;
        }else {
            return null;
        }

    }

}
