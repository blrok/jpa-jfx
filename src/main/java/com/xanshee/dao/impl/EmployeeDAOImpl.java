/**
 * @author  Khantulga
 * @version 1.0
 * @since   2022-12-01
 */
package com.xanshee.dao.impl;

import com.xanshee.dao.EmployeeDAO;
import com.xanshee.model.Employee;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO {
    private final EntityManager entityManager;

    public EmployeeDAOImpl() {
        entityManager = Persistence.createEntityManagerFactory("myApp").createEntityManager();
    }

    @Override
    public void saveOrUpdate(Employee person) {
        entityManager.getTransaction().begin();
        entityManager.merge(person);
        entityManager.getTransaction().commit();
    }

    @Override
    public List<Employee> getAllPersons() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Employee getPersonById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Employee getPersonByEmail(String email) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
