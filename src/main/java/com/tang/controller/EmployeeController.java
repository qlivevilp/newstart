package com.tang.controller;

import com.tang.dao.EmployeeDao;
import com.tang.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

/**
 * @author: create by shujuan.tang
 * @description: com.tang.controller
 * @date:2021/2/22
 **/
@Controller
public class EmployeeController {
    @Autowired
    EmployeeDao employeeDao;
    @GetMapping(value = "/emps")
    public String list(Model model){
        Collection<Employee> employees=employeeDao.getAll();
        model.addAttribute("emps",employees);
        return "emp/list";
    }
}
