package com.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class EmpServiceTest {

    @Test
    public void addEmp() {
        System.out.println("业务层开始添加员工~~~~~~~~~~~~123 ");
        EmpService service=new EmpService();
        service.addEmp();

    }
}