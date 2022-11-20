package com.csi.service;

import com.csi.dao.EmployeeDao;
import com.csi.model.Employee;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeDao employeeDaoImpl;
    @Override
    public Employee saveData(Employee employee) {

        return employeeDaoImpl.saveData(employee);
    }

    @Override
    public List<Employee> getAllData() {

        return employeeDaoImpl.getAllData();
    }

    @Override
    @Cacheable(value = "empId")
    public Optional<Employee> getDataById(int empId) {

        log.info("*******Trying Data From Database*******");
        return  employeeDaoImpl.getDataById(empId);

    }

    @Override
    public Employee getDataByName(String empName) {

        return employeeDaoImpl.getDataByName(empName);
    }

    @Override
    public Employee getDataByAddress(String empAddress) {

        return  employeeDaoImpl.getDataByAddress(empAddress);
    }

    @Override
    public void updateData(int empId, Employee employee) {

        employeeDaoImpl.updateData(empId,employee);

    }

    @Override
    public void deleteDataById(int empId) {

        employeeDaoImpl.deleteDataById(empId);

    }
}
