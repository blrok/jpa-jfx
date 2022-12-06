package com.xanshee.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import org.w3c.dom.events.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    String schoolName , schoolDay ;

    @FXML
    private Button btnLogin;

    @FXML
    private Button btnSearch;

    @FXML
    private GridPane grid;

    @FXML
    private ComboBox<String> cmbxDay;

    @FXML
    private ComboBox<String> cmbxSchool;

    @FXML
    void onBtnClick(ActionEvent event) {

        
    }
    @FXML
    public void onBtnLoginClick(ActionEvent event) throws Exception {
            BorderPane root = FXMLLoader.load(getClass().getResource("/view/loginFndr.fxml"));
            Stage stage = (Stage) btnLogin.getScene().getWindow();
            Scene scene = new Scene(root, 1280, 800);
            stage.setTitle("Fndr/Login");
            stage.setScene(scene);
            stage.show();
    }

    @FXML
    void onBtnSearchClick(ActionEvent event) {
        System.out.println(schoolName + " " + schoolDay);
    }

    @FXML
    void onCmbxDay(ActionEvent event) {
        System.out.println(cmbxDay.getValue());
        schoolDay = cmbxDay.getValue();
        System.out.println(schoolDay);
    }

    @FXML
    void onCmbxSchool(ActionEvent event) {
        System.out.println(cmbxSchool.getValue());
        schoolName = cmbxSchool.getValue();
        System.out.println(schoolName);
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        cmbxDay.getItems().addAll("Даваа", "Мягмар", "Лхагва","Пүрэв", "Баасан");
        cmbxSchool.getItems().addAll("Хичээлийн төв байр", "Хичээлийн байр 2", "Хичээлийн байр 3а", "Хичээлийн байр 3б", "Хичээлийн байр 4" , "Хичээлийн байр 5");
    }
}
