package com.example.carshowroom;

import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import com.DB.DataBaseHandlerPerson;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import javafx.scene.control.cell.PropertyValueFactory;

public class BuyerTable {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableView<Buyer> Buyer;

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
        id_buyer.setCellValueFactory(new PropertyValueFactory<>("id"));
        first_name_buyer.setCellValueFactory(new PropertyValueFactory<>("first_name"));
        midle_name_buyer.setCellValueFactory(new PropertyValueFactory<>("middle_name"));
        last_name_buyer.setCellValueFactory(new PropertyValueFactory<>("last_name"));
        birth_buyer.setCellValueFactory(new PropertyValueFactory<>("birth"));
        gender_buyer.setCellValueFactory(new PropertyValueFactory<>("gender"));
        phone_buyer.setCellValueFactory(new PropertyValueFactory<>("phone_number"));
        Buyer.setItems(data);
    }
    private void dataBase() {
        ResultSet users= dataBase.getBuyer("buyer");
        try{
            while (users.next()){
                Buyer buyer = new Buyer(
                        users.getString(1),
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
