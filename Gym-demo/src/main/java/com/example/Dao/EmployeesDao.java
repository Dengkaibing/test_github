package com.example.Dao;

import com.example.entity.Employees;
import com.example.entity.EmployeesExample;

import java.util.List;

public interface EmployeesDao {
    public List<Employees> SelectAllEmployees();
    public boolean UpdateEmployees(Employees employees);
    public boolean DeleteEmployees(int employeeId);
    public boolean InsertEmployees(Employees employees);
    public List<Employees> SelectEmployees(EmployeesExample employeesExample);
    public Employees SelectBykey(int employeeId);
    public List<String>   SelectEmployeeType();

}
