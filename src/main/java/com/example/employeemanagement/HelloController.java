package com.example.employeemanagement;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    public Label message;


    @FXML
    protected void onHelloButtonClick() {


        String name="Alex";



        try {
            // Load the FXML file for the second scene
            FXMLLoader loader = new FXMLLoader(getClass().getResource("dashboard.fxml"));
            Parent secondScene = loader.load();

            // Access the controller of the second scene
            DashboardController x = loader.getController();

            // Set the data in the controller of the second scene
            x.setUserName(name);


            Stage secondStage = new Stage();
            secondStage.setTitle("User Scene");
            secondStage.setScene(new Scene(secondScene));
            Stage firstSceneStage = (Stage) message.getScene().getWindow();
            firstSceneStage.close();


            secondStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}