/**
 * @author  Khantulga
 * @version 1.0
 * @since   2022-12-01
 */
package com.xanshee.dao;

import com.xanshee.model.Employee;

import java.util.List;

public interface EmployeeDAO {
    void saveOrUpdate(Employee person);
    List<Employee> getAllPersons();
    Employee getPersonById(int id);
    Employee getPersonByEmail(String email);
}
