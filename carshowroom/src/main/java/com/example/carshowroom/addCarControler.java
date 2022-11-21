package com.example.carshowroom;

import java.net.URL;
import java.util.ResourceBundle;
import com.DB.DataBaseHandlerTransport;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class addCarControler {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button addCar;

    @FXML
    private TextField brand_car;

    @FXML
    private TextField dateOfManufacture_car;

    @FXML
    private TextField model_car;

    @FXML
    private TextField price_car;

    @FXML
    private TextField vin_car;

    @FXML
    void initialize() {
        addCar.setOnAction(event -> {
            addCar();
            addCar.getScene().getWindow().hide();
        });
    }
    private void addCar() {
        DataBaseHandlerTransport dbHandler = new DataBaseHandlerTransport();
        int id_owner =1;
        String typeTC = "car";
        String brandTC = brand_car.getText();
        String modelTC = model_car.getText();
        String vin = vin_car.getText();
        String dateOfManufacture = dateOfManufacture_car.getText();
        int prise = Integer.parseInt(price_car.getText());

        Car car = new Car(id_owner,typeTC,brandTC,modelTC,vin,dateOfManufacture,prise);
        dbHandler.signUpTC(car);
    }
}
