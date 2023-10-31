/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restapi.payroll.repository;

/**
 *
 * @author 606041
 */
import org.springframework.data.jpa.repository.JpaRepository;
import com.restapi.payroll.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}