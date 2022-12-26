package com.example.carshowroom;

import java.net.URL;
import java.util.ResourceBundle;

import com.DB.DataBaseHandlerTransport;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class addTruckControler {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button addTruck;

    @FXML
    private TextField brand_truck;

    @FXML
    private TextField dateOfManufacture_truck;

    @FXML
    private TextField model_truck;

    @FXML
    private TextField price_truck;

    @FXML
    private TextField vin_truck;

    @FXML
    void initialize() {
    addTruck.setOnAction(event -> {
        addTruck();
        addTruck.getScene().getWindow().hide();
    });

    }
    private void addTruck() {
        DataBaseHandlerTransport dbHandler = new DataBaseHandlerTransport();
        int id_owner =1;
        String typeTC = "truck";
        String brandTC = brand_truck.getText();
        String modelTC = model_truck.getText();
        String vin = vin_truck.getText();
        String dateOfManufacture = dateOfManufacture_truck.getText();
        int prise = Integer.parseInt(price_truck.getText());

        Car car = new Car(id_owner,typeTC,brandTC,modelTC,vin,dateOfManufacture,prise);
        dbHandler.signUpTC(car);
    }
}
