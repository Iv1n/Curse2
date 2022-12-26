package com.example.carshowroom;

import java.net.URL;
import java.util.ResourceBundle;

import com.DB.DataBaseHandlerPerson;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class EditBuyer {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button EditPerson;

    @FXML
    private TextField dateOfBirth_Person;

    @FXML
    private TextField first_name_Person;

    @FXML
    private TextField last_name_Person;

    @FXML
    private TextField midle_name_Person;

    @FXML
    private TextField phone_Person;

    private int id;
    DataBaseHandlerPerson dbPerson = new DataBaseHandlerPerson();

    @FXML
    void initialize() {
        EditPerson.setOnAction(event -> {
            editCar();
            EditPerson.getScene().getWindow().hide();
        });
    }

    public void editCar() {
        String firstName = first_name_Person.getText();
        String midleName = midle_name_Person.getText();
        String lastName = last_name_Person.getText();
        String Birth = dateOfBirth_Person.getText();
        String phone = phone_Person.getText();
        dbPerson.editBuyer(firstName,midleName,lastName,Birth,phone,id);
    }

    public void setB(Buyer selectedItems) {
        id = selectedItems.getId();
        first_name_Person.setText(selectedItems.getFirst_name());
        midle_name_Person.setText(selectedItems.getMiddle_name());
        last_name_Person.setText(selectedItems.getLast_name());
        dateOfBirth_Person.setText(selectedItems.getBirth());
        phone_Person.setText(selectedItems.getPhone_number());
    }
}
