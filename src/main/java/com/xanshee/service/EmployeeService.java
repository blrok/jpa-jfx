/**
 * @author  Khantulga
 * @version 1.0
 * @since   2022-12-01
 */
package com.xanshee.service;

import com.xanshee.model.Employee;

import java.util.List;

public interface EmployeeService {
    void saveOrUpdate(Employee person);
    List<Employee> getAllPeople();
    Employee getPersonById(int id);
    Employee getPersonByEmail(String email);
}
