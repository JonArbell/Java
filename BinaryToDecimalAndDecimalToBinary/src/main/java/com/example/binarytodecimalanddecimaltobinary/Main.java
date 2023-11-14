package com.example.binarytodecimalanddecimaltobinary;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("calculator.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 500, 723);
        stage.setResizable(false);
        stage.setTitle("Calculator!");
        Image icon = new Image(getClass().getResource("/img/pngwing.com.png").toExternalForm());
        stage.getIcons().add(icon);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}

