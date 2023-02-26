package com.example.carshowroom;

import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import com.DB.DataBaseHandlerPerson;
import com.Prgr.Buyer;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import static java.lang.String.valueOf;


public class BuyerTable {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn<com.Prgr.Buyer, String> Birth;

    @FXML
    private TableView<com.Prgr.Buyer> Buyer;

    @FXML
    private Button buttonBack;

    @FXML
    private TableColumn<com.Prgr.Buyer, String> firstNameBuyer;

    @FXML
    private TableColumn<com.Prgr.Buyer, String> gender;

    @FXML
    private TableColumn<com.Prgr.Buyer, Integer> idBuyer;

    @FXML
    private TableColumn<com.Prgr.Buyer, String> laastNameBuyer;

    @FXML
    private TableColumn<com.Prgr.Buyer, String> midleNameBuyer;

    @FXML
    private TableColumn<com.Prgr.Buyer, String> phoneNumberBuyer;

    DataBaseHandlerPerson dataBase = new DataBaseHandlerPerson();
    private final ObservableList<Buyer> data=FXCollections.observableArrayList();

    @FXML
    void initialize() {
    dataBase();
    idBuyer.setCellValueFactory(new PropertyValueFactory<>("id_buyer"));
    firstNameBuyer.setCellValueFactory(new PropertyValueFactory<>("first_name_buyer"));
    midleNameBuyer.setCellValueFactory(new PropertyValueFactory<>("midle_name_buyer"));
    laastNameBuyer.setCellValueFactory(new PropertyValueFactory<>("last_name_buyer"));
    Birth.setCellValueFactory(new PropertyValueFactory<>("birth_buyer"));
    gender.setCellValueFactory(new PropertyValueFactory<>("gender_buyer"));
    phoneNumberBuyer.setCellValueFactory(new PropertyValueFactory<>("phone_number_buyer"));

        buttonBack.setOnAction(event -> {
            buttonBack.getScene().getWindow().hide();
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

    }

    private void dataBase() {
        ResultSet users= dataBase.getBuyer("buyer");
        try{
            while (users.next()){
                Buyer buyer = new Buyer(
                        users.getInt(1),
                        users.getString(2),
                        users.getString(3),
                        users.getString(4),
                        users.getString(5),
                        users.getString(6),
                        users.getString(7));
                        data.add(buyer);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}

