package com.xanshee.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.net.URL;
import java.util.ResourceBundle;



public class AdminController implements Initializable {

    String schoolName , schoolDay ;

    @FXML
    private Button btnLogout;

    @FXML
    private Button btnSave;

    @FXML
    private Button btnSearch;

    @FXML
    private ComboBox<String> cmbxDay;

    @FXML
    private ComboBox<String> cmbxSchool;

    @FXML
    private GridPane grid;

    @FXML
    void onBtnClick(ActionEvent event) {
        Node node = (javafx.scene.Node) event.getTarget();
        Button clickedBtn = (Button) event.getSource();
        String style = clickedBtn.getStyle();
        if( style.contains("#fff")){
            clickedBtn.setStyle("-fx-background-color: #0096ff;");
        }
        else{
            clickedBtn.setStyle("-fx-background-color: #fff;");
        }
        System.out.println(grid.getRowIndex(node));
        System.out.println(grid.getColumnIndex(node));
        System.out.println(style);
    }

    @FXML
    void onBtnLogoutClick(ActionEvent event) throws Exception {
        VBox root = FXMLLoader.load(getClass().getResource("/view/mainFndr.fxml"));
        Stage stage = (Stage) btnLogout.getScene().getWindow();
        Scene scene = new Scene(root, 1280, 800);
        stage.setTitle("Fndr/Main");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void onBtnSaveClick(ActionEvent event) {
        System.out.println("schoolDay : " + schoolDay);
        System.out.println("schoolName : " + schoolName);
    }

    @FXML
    void onBtnSearchClick(ActionEvent event) {
        System.out.println("schoolDay : " + schoolDay);
        System.out.println("schoolName : " + schoolName);
    }

    @FXML
    void onCmbxDay(ActionEvent event) {
       //System.out.println(cmbxDay.getValue());
        schoolDay = cmbxDay.getValue();
        //System.out.println(schoolDay);
    }

    @FXML
    void onCmbxSchool(ActionEvent event) {
        //System.out.println(cmbxSchool.getValue());
        schoolName = cmbxSchool.getValue();
        //System.out.println(schoolName);
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        cmbxDay.getItems().addAll("Даваа", "Мягмар", "Лхагва","Пүрэв", "Баасан");
        cmbxSchool.getItems().addAll("Хичээлийн төв байр", "Хичээлийн байр 2", "Хичээлийн байр 3а", "Хичээлийн байр 3б", "Хичээлийн байр 4" , "Хичээлийн байр 5");
    }

}

