package com.example.carshowroom;

import java.net.URL;
import java.util.ResourceBundle;

import com.DB.DataBaseHandlerPerson;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

public class addBuyerControler {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button addBuyerButton;

    @FXML
    private TextField dateOfBirth_buyer;

    @FXML
    private CheckBox femaleBox;

    @FXML
    private TextField first_name_buyer;

    @FXML
    private TextField last_name_buyer;

    @FXML
    private CheckBox maleBox;

    @FXML
    private TextField midle_name_buyer;

    @FXML
    private TextField phone_buyer;

    @FXML
    void initialize() {
       addBuyerButton.setOnAction(event ->{
           addBuyer();
           addBuyerButton.getScene().getWindow().hide();
        });

    }
    private void addBuyer() {
        DataBaseHandlerPerson dbHandler = new DataBaseHandlerPerson();
        String first_name = first_name_buyer.getText();
        String midle_name = midle_name_buyer.getText();
        String last_name = last_name_buyer.getText();
        String birh = dateOfBirth_buyer.getText();
        String gender = "";

        if(maleBox.isSelected())
            gender = "MALE";
        else
            gender = "FEMALE";

        String phone = phone_buyer.getText();

        Buyer buyer = new Buyer(first_name,midle_name,last_name,birh,gender,phone);
        dbHandler.signUpUserB(buyer);
    }
}
