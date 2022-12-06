package com.xanshee.controller;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.util.Objects;

public class LoginController {

    @FXML
    private Button btnBackMain;

    @FXML
    private Button btnLogin;

    @FXML
    private ImageView imgView;

    @FXML
    private TextField txtLoginName;

    @FXML
    private PasswordField txtPassword;

    @FXML
    void onBtnBackMain(ActionEvent event) throws Exception {
        VBox root = FXMLLoader.load(getClass().getResource("/view/mainFndr.fxml"));
        Stage stage = (Stage) btnBackMain.getScene().getWindow();
        Scene scene = new Scene(root, 1280, 800);
        stage.setTitle("Fndr/Main");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void onBtnLoginClick(ActionEvent event) throws Exception{
        if(Objects.equals(txtLoginName.getText(), "bolor") && Objects.equals(txtPassword.getText(), "123")){
            VBox root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/view/adminFndr.fxml")));
            Stage stage = (Stage) btnLogin.getScene().getWindow();
            Scene scene = new Scene(root, 1280, 800);
            stage.setTitle("Fndr/Admin");
            stage.setScene(scene);
            stage.show();
        }
        else {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Warning");
            alert.setHeaderText("Please check username or password !");
            //alert.setContentText("Do you want to close the application?");
            ButtonType okButton= new ButtonType("Yes , try again" , ButtonBar.ButtonData.OK_DONE);
            ButtonType cancelButton= new ButtonType("No, back to home", ButtonBar.ButtonData.NO);
            alert.getButtonTypes().setAll(okButton, cancelButton);
            alert.initModality(Modality.APPLICATION_MODAL);
            alert.showAndWait().ifPresent(response -> {
                if (response == ButtonType.NO) {
                    Platform.exit();}
            });
            }
        }

}

