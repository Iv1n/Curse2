package com.example.carshowroom;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button buyerButton;

    @FXML
    private Button sellButton;

    @FXML
    private Button serviceStationButton;

    @FXML
    private Button showroomButton;

    @FXML
    void initialize() {
        sellButton.setOnAction(event -> {
     sellButton.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("sellController.fxml"));
            try {
                loader.load();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();
        });
        showroomButton.setOnAction(event ->{
            showroomButton.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("showroom.fxml"));
            try {
                loader.load();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();
        });

        buyerButton.setOnAction(event ->{
            buyerButton.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("buyer.fxml"));
            try {
                loader.load();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();
        });

        serviceStationButton.setOnAction(event ->{
            serviceStationButton.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("serviceStation.fxml"));
            try {
                loader.load();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();
        });
    }

}
