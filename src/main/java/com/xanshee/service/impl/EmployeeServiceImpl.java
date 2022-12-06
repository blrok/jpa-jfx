/**
 * @author  Khantulga
 * @version 1.0
 * @since   2022-12-01
 */
package com.xanshee.service.impl;

import com.xanshee.dao.EmployeeDAO;
import com.xanshee.dao.impl.EmployeeDAOImpl;
import com.xanshee.model.Employee;
import com.xanshee.service.EmployeeService;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeDAO broker;

    public EmployeeServiceImpl() {
        broker = new EmployeeDAOImpl();
    }

    @Override
    public void saveOrUpdate(Employee person) {
        broker.saveOrUpdate(person);
    }

    @Override
    public List<Employee> getAllPeople() {
        return broker.getAllPersons();
    }

    @Override
    public Employee getPersonById(int id) {
        return broker.getPersonById(id);
    }

    @Override
    public Employee getPersonByEmail(String email) {
        return broker.getPersonByEmail(email);
    }
}
