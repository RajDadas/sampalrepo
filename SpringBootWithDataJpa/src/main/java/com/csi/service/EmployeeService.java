package com.csi.service;

import com.csi.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    public Employee saveData(Employee employee);
    public List<Employee> getAllData();
    public Optional<Employee> getDataById(int empId);
    public Employee getDataByName(String empName);
    public Employee getDataByAddress(String empAddress);
    public void updateData(int empId, Employee employee);
    public void deleteDataById(int empId);
}
