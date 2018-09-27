package com.controller;

import com.domain.Phone;
import com.repository.PhoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("phone")
public class Handler {
    @Autowired
    PhoneRepository phoneRepository;


    @RequestMapping("/getphones")
    public List<Phone> getPhones(){
        return phoneRepository.getPhones();
    }
    @RequestMapping("/savephone")
    public Phone savePhone(Phone phone){

        return phoneRepository.savePhone(phone);

    }
    @RequestMapping("/deletephone/{pid}")
    public int deletePhone(@PathVariable("pid") int pid){

        return phoneRepository.deletePhone(pid);


    }


}
