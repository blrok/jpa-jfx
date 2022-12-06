/**
 * @author  Khantulga
 * @version 1.0
 * @since   2022-12-01
 */
package com.xanshee.controller;

import com.xanshee.service.EmployeeService;
import com.xanshee.service.impl.EmployeeServiceImpl;
import com.xanshee.model.Employee;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class EmployeeController implements Initializable {
    private EmployeeService service;

    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        Employee p = new Employee("Demo", "User", "demo@example.com");
        service.saveOrUpdate(p);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // get an instance of PersonService
        service = new EmployeeServiceImpl();

    }
}