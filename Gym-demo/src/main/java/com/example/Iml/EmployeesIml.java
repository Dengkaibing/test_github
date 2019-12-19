package com.example.Iml;

import com.example.Dao.EmployeesDao;
import com.example.entity.Employees;
import com.example.entity.EmployeesExample;
import com.example.respository.EmployeesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeesIml  implements EmployeesDao {
    @Autowired
    private EmployeesMapper employeesMapper;
    @Override
    public List<Employees> SelectAllEmployees() {
        EmployeesExample employeesExample=new EmployeesExample();
        List<Employees> employeesLis=employeesMapper.selectByExample(employeesExample);
        return employeesLis;
    }

    @Override
    public boolean UpdateEmployees(Employees employees) {
        int i=employeesMapper.updateByPrimaryKeySelective(employees);
        return i!=0?true:false;
    }

    @Override
    public boolean DeleteEmployees(int employeeId) {
        int i=employeesMapper.deleteByPrimaryKey(employeeId);
        return i!=0?true:false;
    }

    @Override
    public boolean InsertEmployees(Employees employees) {
        int i=employeesMapper.insertSelective(employees);
        return i!=0?true:false;
    }

    @Override
    public List<Employees> SelectEmployees(EmployeesExample employeesExample) {
           List<Employees> employeesList=employeesMapper.selectByExample(employeesExample);
        return employeesList;
    }

    @Override
    public Employees SelectBykey(int employeeId) {
        Employees employees=employeesMapper.selectByPrimaryKey(employeeId);
        return employees;
    }

    @Override
    public List<String> SelectEmployeeType() {
        List<String> stringList=employeesMapper.SelectEmployeeType();
        return stringList;
    }
}
