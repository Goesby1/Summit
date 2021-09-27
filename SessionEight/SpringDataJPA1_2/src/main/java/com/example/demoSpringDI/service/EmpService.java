package com.example.demoSpringDI.service;
import com.example.demoSpringDI.model.*;
public interface EmpService {
public void deleteEmpId(int id);
public Employee getEmployee(int id);
public long getCount();
}
