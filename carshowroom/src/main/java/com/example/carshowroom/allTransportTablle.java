package com.example.carshowroom;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.stage.Stage;

public class allTransportTablle {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn<?, ?> brandTrunsport;

    @FXML
    private Button buttonBack;

    @FXML
    private TableColumn<?, ?> dateOfMnufactureTrunsport;

    @FXML
    private TableColumn<?, ?> idOwnerTrunsport;

    @FXML
    private TableColumn<?, ?> idTrunsport;

    @FXML
    private TableColumn<?, ?> modelTrunsport;

    @FXML
    private TableColumn<?, ?> priseTrunsport;

    @FXML
    private TableColumn<?, ?> vinTrunsport;

    @FXML
    void initialize() {
        buttonBack.setOnAction(event -> {
            buttonBack.getScene().getWindow().hide();
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
    }

}
