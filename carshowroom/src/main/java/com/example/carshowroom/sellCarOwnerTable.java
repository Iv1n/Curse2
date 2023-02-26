package com.example.carshowroom;

import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import com.example.carshowroom.DataBase.DataBaseHandlerTransport;
import com.example.carshowroom.Transport;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import javafx.scene.control.TableView;
public class sellCarOwnerTable {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableView<Transport> tableSaleOwner;
    @FXML
    private TableColumn<Transport, String> brendTCSale;

    @FXML
    private Button buttonBack;

    @FXML
    private TableColumn<Transport, String> dateOfManufactureTCSale;

    @FXML
    private TableColumn<Transport, Integer> idEmployee;

    @FXML
    private TableColumn<Transport, Integer> idOwnerSale;

    @FXML
    private TableColumn<Transport, Integer> idTCSale;

    @FXML
    private TableColumn<Transport, String> modelTCSale;

    @FXML
    private TableColumn<Transport, String> priceTCSale;

    @FXML
    private TableColumn<Transport, String> typeTCSale;

    @FXML
    private TableColumn<Transport, String> vinTCSale;
    private final ObservableList<Transport> data = FXCollections.observableArrayList();
    DataBaseHandlerTransport dataBase = new DataBaseHandlerTransport();
    @FXML
    void initialize() {
        dataTC();
        setDTC();
        buttonBack.setOnAction(event -> {
            buttonBack.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            Parent root = null;
            try {
                root = FXMLLoader.load(getClass().getResource("sellController.fxml"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            Stage stage = new Stage();
            stage.setScene(new Scene(root, 320, 275));
            stage.setResizable(false);
            stage.show();
        });

    }
    private void dataTC(){
    ResultSet tc = dataBase.getTableSaleOwner();
        try{
            while (tc.next()){
                Transport transport = new Transport(
                        tc.getInt(1),
                        tc.getInt(2),
                        tc.getString(3),
                        tc.getString(4),
                        tc.getString(5),
                        tc.getString(6),
                        tc.getString(7),
                        tc.getInt(8),
                        tc.getInt(9));
                data.add(transport);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    private void setDTC(){
        idTCSale.setCellValueFactory(new PropertyValueFactory<>("id"));
        idOwnerSale.setCellValueFactory(new PropertyValueFactory<>("id_owner"));
        typeTCSale.setCellValueFactory(new PropertyValueFactory<>("typeTC"));
        brendTCSale.setCellValueFactory(new PropertyValueFactory<>("brandTC"));
        modelTCSale.setCellValueFactory(new PropertyValueFactory<>("modelTC"));
        vinTCSale.setCellValueFactory(new PropertyValueFactory<>("vin"));
        dateOfManufactureTCSale.setCellValueFactory(new PropertyValueFactory<>("dateOfManufacture"));
        priceTCSale.setCellValueFactory(new PropertyValueFactory<>("prise"));
        idEmployee.setCellValueFactory(new PropertyValueFactory<>("id_employee"));
        tableSaleOwner.setItems(data);
    }

}
