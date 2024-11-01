package com.example.employeemanagement;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class DashboardController {

    public Label welcomeTXT;

    public void logoutclick(ActionEvent actionEvent) {


        try {
            Parent secondScene = FXMLLoader.load(getClass().getResource("hello-view.fxml"));

            Stage secondStage = new Stage();
            secondStage.setTitle("Login");
            secondStage.setScene(new Scene(secondScene));
            Stage firstSceneStage = (Stage) welcomeTXT.getScene().getWindow();
            firstSceneStage.close();

            secondStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void exitbutton(ActionEvent actionEvent) {

        System.exit(0);

    }

    public  void setUserName(String name){

        welcomeTXT.setText("Welcome,"+name);
    }


}