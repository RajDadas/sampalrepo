package com.csi.dao;

import com.csi.model.Employee;
import com.csi.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class EmployeeDaoImpl  implements  EmployeeDao{


    @Autowired
    EmployeeRepository employeeRepositoryImpl;
    @Override
    public Employee saveData(Employee employee) {

        return employeeRepositoryImpl.save(employee);
    }

    @Override
    public List<Employee> getAllData() {

        return employeeRepositoryImpl.findAll();
    }

    @Override
    public Optional<Employee> getDataById(int empId) {

        return employeeRepositoryImpl.findById(empId);
    }

    @Override
    public Employee getDataByName(String empName) {

        return employeeRepositoryImpl.findByEmpName(empName);
    }

    @Override
    public Employee getDataByAddress(String empAddress) {

        return employeeRepositoryImpl.findByEmpAddress(empAddress);
    }

    @Override
    public void updateData(int empId, Employee employee) {

         employeeRepositoryImpl.save(employee);
    }

    @Override
    public void deleteDataById(int empId) {

        employeeRepositoryImpl.deleteById(empId);
    }
}
