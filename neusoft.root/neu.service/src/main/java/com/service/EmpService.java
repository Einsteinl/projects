package com.service;

import com.dao.EmpDao;

public class EmpService {
    private EmpDao empDao=new EmpDao();
    public void addEmp(){
        empDao.save();
    }

}
