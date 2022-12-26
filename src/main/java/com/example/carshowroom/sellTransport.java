package com.example.carshowroom;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import com.DB.DataBaseHandlerPerson;
import com.DB.DataBaseHandlerTransport;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class sellTransport {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button backHub;

    @FXML
    private TextField birth_buyer;

    @FXML
    private CheckBox checkBoxFemale;

    @FXML
    private CheckBox checkBoxMale;

    @FXML
    private ComboBox<String> chooseVIN;

    @FXML
    private TextField first_name_buyer;


    @FXML
    private TextField last_name_buyer;

    @FXML
    private TextField midle_name_buyer;


    @FXML
    private TextField phone_buyer;


    @FXML
    private Button sell;

    @FXML
    private ComboBox<String> chooseId;

    DataBaseHandlerTransport dbTC = new DataBaseHandlerTransport();
    DataBaseHandlerPerson dbPerson = new DataBaseHandlerPerson();
    ObservableList<String> ComboBoxCar = FXCollections.observableArrayList();
    ObservableList<String> nnk = FXCollections.observableArrayList();
    ObservableList<String> ComboBoxEmployee = FXCollections.observableArrayList();

    @FXML
    void initialize() {

    chooseVIN.setItems(ComboBoxCar);
    choseVIN();
    chooseId.setItems(ComboBoxEmployee);
    choseId();

        backHub.setOnAction(event -> {
            backHub.getScene().getWindow().hide();
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

        sell.setOnAction(event -> {
            Object selectedItems = chooseVIN.getValue();
            String vin = String.valueOf(selectedItems);
            System.out.println(vin);
            Object selectedItem = chooseId.getValue();
            int id = Integer.parseInt(String.valueOf(selectedItem));
            System.out.println(id);
            addBuyer();
            dbPerson.infBuyer(phone_buyer.getText());
            dbTC.sellTC(Buyer.id_buyer,vin, id);
            sell.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            Parent root = null;
            try {
                root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            Stage stage = new Stage();
            stage.setScene(new Scene(root, 320, 480));
            stage.setResizable(false);
            stage.show();
        });


    }
  private void choseVIN(){
            Connection conn = dbTC.getDbConnection();
            ResultSet rs = null;
            try {
                rs = conn.createStatement().executeQuery("SELECT vin FROM carshowroom.transport WHERE id_owner=0");
                while (rs.next()) {
                    String a = rs.getString("vin");
                    ComboBoxCar.add(a);
                }
            } catch (SQLException e) {

                throw new RuntimeException(e);
            }
    }
    private void choseId(){
        Connection conn = dbPerson.getDbConnection();
        ResultSet rs = null;
        try {
            rs = conn.createStatement().executeQuery("SELECT id_employee FROM carshowroom.employee");
            while (rs.next()) {
                String a = rs.getString("id_employee");
                ComboBoxEmployee.add(a);
            }
        } catch (SQLException e) {

            throw new RuntimeException(e);
        }
        }

    private void addBuyer() {

        String first_name = first_name_buyer.getText();
        String midle_name = midle_name_buyer.getText();
        String last_name = last_name_buyer.getText();
        String birh = birth_buyer.getText();
        String gender = "";

        if(checkBoxMale.isSelected())
            gender = "MALE";
        else
            gender = "FEMALE";

        String phone = phone_buyer.getText();

        Buyer buyer = new Buyer(first_name,midle_name,last_name,birh,gender,phone);
        dbPerson.signUpUserB(buyer);
    }

}


