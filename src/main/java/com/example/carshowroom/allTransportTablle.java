package com.example.carshowroom;

import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import com.DB.DataBaseHandlerTransport;
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

public class allTransportTablle {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableView<Transport> Transport;

    @FXML
    private TableColumn<Transport, String> brand_transport;

    @FXML
    private Button buttonBack;

    @FXML
    private TableColumn<Transport, String> dateOfManufactureTransport;

    @FXML
    private Button dellTransport;

    @FXML
    private TableColumn<Transport, Integer> idTC;

    @FXML
    private TableColumn<Transport, String> model_transport;

    @FXML
    private TableColumn<Transport, Integer> priceTransport;

    @FXML
    private TableColumn<Transport, String> type_transport;

    @FXML
    private TableColumn<Transport, String> vin_transport;
    DataBaseHandlerTransport dataBase = new DataBaseHandlerTransport();
    private final ObservableList<Transport> data = FXCollections.observableArrayList();

    @FXML
    void initialize() {
        dataTransport();
        setD();
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
        dellTransport.setOnAction(event -> {
            dell();
            Transport.getItems().clear();
            setD();
            dataTransport();
        });
    }

    private void dataTransport() {
        ResultSet users = dataBase.getTransport("transport");
        try {
            while (users.next()) {
                Transport transport = new Transport(
                        users.getInt(1),
                        users.getString(2),
                        users.getString(3),
                        users.getString(4),
                        users.getString(5),
                        users.getString(6),
                        users.getInt(7));
                data.add(transport);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private void setD() {
        idTC.setCellValueFactory(new PropertyValueFactory<>("id"));
        type_transport.setCellValueFactory(new PropertyValueFactory<>("typeTC"));
        brand_transport.setCellValueFactory(new PropertyValueFactory<>("brandTC"));
        model_transport.setCellValueFactory(new PropertyValueFactory<>("modelTC"));
        vin_transport.setCellValueFactory(new PropertyValueFactory<>("vin"));
        dateOfManufactureTransport.setCellValueFactory(new PropertyValueFactory<>("dateOfManufacture"));
        priceTransport.setCellValueFactory(new PropertyValueFactory<>("prise"));
        Transport.setItems(data);
    }

    private void dell() {
        Transport transport = Transport.getSelectionModel().getSelectedItem();
        int id = transport.getId();
        String str = String.valueOf(id);
        String Table = "transport";
        Object selectedItems = Transport.getSelectionModel().getSelectedItems();
        Transport.getItems().remove(selectedItems);
        dataBase.delete(Table, str);
    }
}
