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
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class TableMaintenance {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn<Transport, String> brendTC;

    @FXML
    private Button buttonBack;

    @FXML
    private TableColumn<Transport, String> dateOfManufactureTC;

    @FXML
    private TableColumn<Transport, Integer> idOwner;

    @FXML
    private TableColumn<Transport, Integer> idTC;

    @FXML
    private TableColumn<Transport, String> modelTC;

    @FXML
    private TableView<Transport> table;

    @FXML
    private TableColumn<Transport, String> typeTC;

    @FXML
    private TableColumn<Transport, String> vinTC;

    DataBaseHandlerTransport dataBase = new DataBaseHandlerTransport();
    private ObservableList<Transport> data = FXCollections.observableArrayList();

    @FXML
    void initialize() {
        tbl();
        setT();

       buttonBack.setOnAction(event -> {
           buttonBack.getScene().getWindow().hide();
           FXMLLoader loader = new FXMLLoader();
           Parent root = null;
           try {
               root = FXMLLoader.load(getClass().getResource("serviceStation.fxml"));
           } catch (IOException e) {
               e.printStackTrace();
           }
           Stage stage = new Stage();
           stage.setScene(new Scene(root, 320, 220));
           stage.setResizable(false);
           stage.show();
       });
    }
    private void tbl() {
        ResultSet table = dataBase.tableMain();
        try{
            while (table.next()){
                Transport inf = new Transport(
                        table.getInt(1),
                        table.getInt(2),
                        table.getString(3),
                        table.getString(4),
                        table.getString(5),
                        table.getString(6),
                        table.getString(7));
                data.add(inf);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    private void setT(){
        idOwner.setCellValueFactory(new PropertyValueFactory<>("id_owner"));
        idTC.setCellValueFactory(new PropertyValueFactory<>("id"));
        typeTC.setCellValueFactory(new PropertyValueFactory<>("typeTC"));
        brendTC.setCellValueFactory(new PropertyValueFactory<>("brandTC"));
        modelTC.setCellValueFactory(new PropertyValueFactory<>("modelTC"));
        vinTC.setCellValueFactory(new PropertyValueFactory<>("vin"));
        dateOfManufactureTC.setCellValueFactory(new PropertyValueFactory<>("dateOfManufacture"));
        table.setItems(data);
    }
}
