package com.dao;

import org.junit.Test;

import static org.junit.Assert.*;

public class EmpDaoTest {

    @Test
    public void save() {
        EmpDao dao=new EmpDao();
        dao.save();
    }
}