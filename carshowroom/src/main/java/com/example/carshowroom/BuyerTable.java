package com.example.carshowroom;

import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import com.DB.DataBaseHandlerPerson;

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

public class BuyerTable {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableView<Buyer> Buyer;
    @FXML
    private Button addBuyer;

    @FXML
    private Button changeBuyer;

    @FXML
    private Button dellBuyer;

    @FXML
    private Button updateButton;

    @FXML
    private TableColumn<Buyer, String> birth_buyer;

    @FXML
    private Button buttonBack;

    @FXML
    private TableColumn<Buyer, String> first_name_buyer;

    @FXML
    private TableColumn<Buyer, String> gender_buyer;

    @FXML
    private TableColumn<Buyer, String> id_buyer;

    @FXML
    private TableColumn<Buyer, String> last_name_buyer;

    @FXML
    private TableColumn<Buyer, String> midle_name_buyer;

    @FXML
    private TableColumn<Buyer, String> phone_buyer;
    DataBaseHandlerPerson dataBase = new DataBaseHandlerPerson();
    private final ObservableList<Buyer> data=FXCollections.observableArrayList();


    @FXML
    void initialize() {
        dataBase();
        setD();

        buttonBack.setOnAction(event -> {
            buttonBack.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            Parent root = null;
            try {
                root = FXMLLoader.load(getClass().getResource("buyer.fxml"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            Stage stage = new Stage();
            stage.setScene(new Scene(root, 320, 280));
            stage.setResizable(false);
            stage.show();
        });

        addBuyer.setOnAction(event -> {
            addBuyer.getScene();
            FXMLLoader loader = new FXMLLoader();
            Parent root = null;
            try {
                root = FXMLLoader.load(getClass().getResource("addBuyerControler.fxml"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            Stage stage = new Stage();
            stage.setScene(new Scene(root, 360, 320));
            stage.setResizable(false);
            stage.show();
        });

        updateButton.setOnAction(event -> {
            try {
                id_buyer.getColumns().clear();
                first_name_buyer.getColumns().clear();
                midle_name_buyer.getColumns().clear();
                last_name_buyer.getColumns().clear();
                birth_buyer.getColumns().clear();
                gender_buyer.getColumns().clear();
                phone_buyer.getColumns().clear();
                setD();
            } catch (Exception exc) {
                exc.printStackTrace();
            }
        });
    }
    private void setD(){
        id_buyer.setCellValueFactory(new PropertyValueFactory<>("id"));
        first_name_buyer.setCellValueFactory(new PropertyValueFactory<>("first_name"));
        midle_name_buyer.setCellValueFactory(new PropertyValueFactory<>("middle_name"));
        last_name_buyer.setCellValueFactory(new PropertyValueFactory<>("last_name"));
        birth_buyer.setCellValueFactory(new PropertyValueFactory<>("birth"));
        gender_buyer.setCellValueFactory(new PropertyValueFactory<>("gender"));
        phone_buyer.setCellValueFactory(new PropertyValueFactory<>("phone_number"));
        Buyer.setItems(data);
    }
    private void Delete(){
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


