package com.employeeapp.employee.service.Controller;

import com.employeeapp.employee.service.Service.EmployeeService;
import com.employeeapp.employee.service.response.EmployeeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpolyeeController {

@Autowired
EmployeeService employeeService;

    @GetMapping("/employees/{id}")
    ResponseEntity<EmployeeResponse> getEmployeeDetails(@PathVariable("id")int id){
    //dbcall

return ResponseEntity.status(HttpStatus.OK).body(employeeService.getEmployeeByID(id));

    }
}
