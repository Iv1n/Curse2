package com.example.carshowroom;

import java.net.URL;
import java.util.ResourceBundle;

import com.DB.DataBaseHandlerTransport;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class EditTC {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button EditTcE;

    @FXML
    private TextField brand_TcE;

    @FXML
    private TextField dateOfManufacture_TcE;

    @FXML
    private TextField model_TcE;

    @FXML
    private TextField price_TcE;

    @FXML
    private TextField vin_TcE;
    int id;
    DataBaseHandlerTransport dbHandler = new DataBaseHandlerTransport();
    @FXML
    void initialize() {
        EditTcE.setOnAction(event -> {
            editCar();
            EditTcE.getScene().getWindow().hide();
        });
    }
    public void editCar(){
        String newBrandTC = brand_TcE.getText();
        String newModelTC = model_TcE.getText();
        String newVin = vin_TcE.getText();
        String newDateOfManufacture = dateOfManufacture_TcE.getText();
        Integer prise = Integer.valueOf(price_TcE.getText());
        dbHandler.editTransport(newBrandTC,newModelTC,newVin,newDateOfManufacture,prise, id);
    }
    public void setD(Transport selectedItems){
    id = selectedItems.getId();
    brand_TcE.setText(selectedItems.getBrandTC());
    model_TcE.setText(selectedItems.getModelTC());
    vin_TcE.setText(selectedItems.getVin());
    dateOfManufacture_TcE.setText(selectedItems.getDateOfManufacture());
    price_TcE.setText(String.valueOf(selectedItems.getPrise()));
    }
}
