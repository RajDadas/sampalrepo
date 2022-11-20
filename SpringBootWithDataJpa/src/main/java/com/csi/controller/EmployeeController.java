package com.csi.controller;


import com.csi.model.Employee;
import com.csi.repo.EmployeeRepository;
import com.csi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class EmployeeController {
    @Autowired
    EmployeeService employeeServiceImpl;
    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping("/getalldata")
    public List<Employee> getAllData(){

        return employeeServiceImpl.getAllData();
    }
    @GetMapping("/getdatabyid/{empId}")
    public Optional<Employee> getDataById(@PathVariable int empId){

        return employeeServiceImpl.getDataById(empId);
    }

    @GetMapping("/getdatabyname/{empName}")
    public Employee getDataByName(@PathVariable String empName){

        return employeeServiceImpl.getDataByName(empName);
    }

    @GetMapping("/getdatabyaddress/{empAddress}")
    public Employee getDatByAddress(@PathVariable String empAddress){
        return employeeServiceImpl.getDataByAddress(empAddress);
    }


    @PostMapping("/savedata")
    public Employee saveData(@RequestBody Employee employee){

        return employeeServiceImpl.saveData(employee);
    }

    @PutMapping("/updatedatabyid/{empId}")
    public String updateDataById(@PathVariable int empId,@RequestBody Employee employee){
        employeeServiceImpl.updateData(empId,employee);
        return "Data Updated Sucessfully";
    }

    @DeleteMapping("/deletedatabyid/{empId}")
    public  String deleteDataById(@PathVariable int empId){

        return " Data Deleted sucessfully";
    }
}
