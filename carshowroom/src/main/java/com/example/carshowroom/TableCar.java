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

public class TableCar {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableView<Transport> Car;

    @FXML
    private Button addTransport;

    @FXML
    private TableColumn<Transport, String> brand_car;

    @FXML
    private Button buttonBack;

    @FXML
    private Button UpdateButton;

    @FXML
    private Button changeTransport;

    @FXML
    private TableColumn<Transport, String> dateOfManufacture_car;

    @FXML
    private Button dellTransport;

    @FXML
    private TableColumn<Transport, Integer> idCar;

    @FXML
    private TableColumn<Transport, String> model_car;

    @FXML
    private TableColumn<Transport, Integer> price_car;

    @FXML
    private TableColumn<Transport, String> vin_car;

    DataBaseHandlerTransport dataBase = new DataBaseHandlerTransport();
    private final ObservableList<Transport> data1 = FXCollections.observableArrayList();

    @FXML
    void initialize() {
        dataCar();
        setD();
        buttonBack.setOnAction(event -> {
            buttonBack.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            Parent root = null;
            try {
                root = FXMLLoader.load(getClass().getResource("showroom.fxml"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            Stage stage = new Stage();
            stage.setScene(new Scene(root, 320, 360));
            stage.setResizable(false);
            stage.show();
        });
        addTransport.setOnAction(event -> {
            FXMLLoader loader = new FXMLLoader();
            Parent root = null;
            try {
                root = FXMLLoader.load(getClass().getResource("addCarControler.fxml"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            Stage stage = new Stage();
            stage.setScene(new Scene(root, 360, 320));
            stage.setResizable(false);
            stage.show();
        });
        dellTransport.setOnAction(event -> {
            dell();
            Car.getItems().clear();
            setD();
            dataCar();
        });
        UpdateButton.setOnAction(event -> {
            try {
                Car.getItems().clear();
                setD();
                dataCar();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
    }

    private void dataCar() {
        ResultSet users = dataBase.getTC("transport", "car");
        try {
            while (users.next()) {
                Transport transport = new Transport(
                        users.getInt(1),
                        users.getString(2),
                        users.getString(3),
                        users.getString(4),
                        users.getString(5),
                        users.getInt(6));
                data1.add(transport);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private void setD() {
        idCar.setCellValueFactory(new PropertyValueFactory<>("id"));
        brand_car.setCellValueFactory(new PropertyValueFactory<>("brandTC"));
        model_car.setCellValueFactory(new PropertyValueFactory<>("modelTC"));
        vin_car.setCellValueFactory(new PropertyValueFactory<>("vin"));
        dateOfManufacture_car.setCellValueFactory(new PropertyValueFactory<>("dateOfManufacture"));
        price_car.setCellValueFactory(new PropertyValueFactory<>("prise"));
        Car.setItems(data1);
    }

    private void dell() {
        Transport transport = Car.getSelectionModel().getSelectedItem();
        int id = transport.getId();
        String str = String.valueOf(id);
        String Table = "transport";
        System.out.println(transport.getId());
        Object selectedItems = Car.getSelectionModel().getSelectedItems();
        Car.getItems().remove(selectedItems);
        dataBase.delete(Table, str);
    }

    private void change() {
    }
}
