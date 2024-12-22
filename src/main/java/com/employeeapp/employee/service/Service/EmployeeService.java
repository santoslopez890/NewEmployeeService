package com.employeeapp.employee.service.Service;

import com.employeeapp.employee.service.response.EmployeeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private com.employeeapp.employee.service.Repo.EmployeeRepo EmployeeRepo;

    //employee object-employee respince
    public EmployeeResponse getEmployeeByID(int id){
        EmployeeResponse employeeResponse=new EmployeeResponse();
        employeeResponse.setId(EmployeeRepo.findById(id).get().getId());
        employeeResponse.setName(EmployeeRepo.findById(id).get().getName());
        employeeResponse.setEmail(EmployeeRepo.findById(id).get().getEmail());
        employeeResponse.setBloodgroup(EmployeeRepo.findById(id).get().getBloodgroup());
        return employeeResponse;
    }
}
