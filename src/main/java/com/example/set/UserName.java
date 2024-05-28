package com.example.set;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.TextInputDialog;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.File;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public class UserName extends Application {

    private String name;
    @Override
    public void start(Stage primaryStage) {




        CompletableFuture<String> userInputFuture = new CompletableFuture<>();



        TextInputDialog dialog = new TextInputDialog();

        dialog.setTitle("Enter Your Username");
        dialog.setHeaderText("Для продолжения игры введите свое имя и нажмите OK");
        dialog.setContentText("Имя:");

        Optional<String> result = dialog.showAndWait();
        result.ifPresent(userInputFuture::complete);

        userInputFuture.thenAccept(username -> {
            System.out.println("Username entered: " + username);
            // Дальнейшие действия с полученным именем пользователя
            name=username;
        });


    }

    public String getUserName(){return name;}





    public static void main(String[] args) {
        launch(args);
    }


}
