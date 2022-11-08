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

public class sellCarOwnerTable {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn<?, ?> brendTrunsportSale;

    @FXML
    private Button buttonBack;

    @FXML
    private TableColumn<?, ?> dateOfMnufactureTrunsportSale;

    @FXML
    private TableColumn<?, ?> dateOfSale;

    @FXML
    private TableColumn<?, ?> idEmployeeSale;

    @FXML
    private TableColumn<?, ?> idOwnerSale;

    @FXML
    private TableColumn<?, ?> idSale;

    @FXML
    private TableColumn<?, ?> idTransportSale;

    @FXML
    private TableColumn<?, ?> priseSale;

    @FXML
    private TableColumn<?, ?> vinModelSale;

    @FXML
    private TableColumn<?, ?> vinSale;

    @FXML
    void initialize() {
        buttonBack.setOnAction(event -> {
            buttonBack.getScene().getWindow().hide();
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
    }

}
