package com.xanshee.bootloader;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        VBox root = FXMLLoader.load(getClass().getResource("/view/mainFndr.fxml"));
        Scene scene = new Scene(root, 1280, 800);
        stage.setTitle("Fndr/Main ");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}
