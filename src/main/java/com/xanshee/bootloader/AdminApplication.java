package com.xanshee.bootloader;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class AdminApplication extends Application{
    @Override
    public void start(Stage stage) throws IOException {
        VBox root = FXMLLoader.load(getClass().getResource("/view/adminFndr.fxml"));
        Scene scene = new Scene(root, 1280, 800);
        stage.setTitle("Fndr/Admin ");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}

