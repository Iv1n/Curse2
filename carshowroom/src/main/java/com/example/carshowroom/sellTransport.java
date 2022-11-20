package com.example.carshowroom;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import com.DB.DataBaseHandlerPerson;
import com.DB.DataBaseHandlerTransport;
import com.Prgr.Person;
import com.Prgr.Transport;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.scene.text.Text;

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
    private Text brandTC;

    @FXML
    private CheckBox checkBoxFemale;

    @FXML
    private CheckBox checkBoxMale;

    @FXML
    private ComboBox<String> chooseVIN;

    @FXML
    private Text dateOfManufacture;

    @FXML
    private TextField dateSalle;

    @FXML
    private Text first_name_Employee;

    @FXML
    private TextField first_name_buyer;

    @FXML
    private Text last_name_Employee;

    @FXML
    private TextField last_name_buyer;

    @FXML
    private Text midle_name_Employee;

    @FXML
    private TextField midle_name_buyer;

    @FXML
    private Text modelTC;

    @FXML
    private TextField phone_buyer;

    @FXML
    private Text prise;

    @FXML
    private Button sell;

    @FXML
    private Button loadEmployee;

    @FXML
    private Button loadTC;

    @FXML
    private Text typeTC;
    @FXML
    private ComboBox<String> chooseId;

    ObservableList data;
    ObservableList data1;

    ObservableList intTransport;

    DataBaseHandlerTransport dbInf = new DataBaseHandlerTransport();

    @FXML
    void initialize() {
        choseVIN();
        chooseVIN.setItems(data);

        choseId();
        chooseId.setItems(data1);
/*
        loadTC.setOnAction(event -> {
           infcar();
           typeTC.setText(intTransport.toString());
           brandTC.setText(intTransport.toString());
           modelTC.setText(intTransport.toString());
           dateOfManufacture.setText(intTransport.toString());
           prise.setText(intTransport.toString());
        });
*/
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
            stage.setScene(new Scene(root, 320, 480));
            stage.setResizable(false);
            stage.show();
        });

        sell.setOnAction(event -> {
            addBuyer();
        });


    }
/*
    private void infcar(String typeTC, String brandTC, String modelTC, String dateOfManufacture,
    int prise){
        DataBaseHandlerTransport dbHandelr = new DataBaseHandlerTransport();
        Transport transport = new Transport();
        transport.getBrandTC(typeTC);
        transport.getBrandTC(brandTC);
        transport.getModelTC(modelTC);
        transport.getDateOfmManufacture(dateOfManufacture);
        transport.getPrise(prise);
        dbHandelr.ConclusionOfTransport(Transport);
ResultSet result = dbHandelr.getTransport(chooseVIN);
   }
*/




    private void choseId(){
        Connection c;
        DataBaseHandlerPerson dbTransport = new DataBaseHandlerPerson();
        data1 = FXCollections.observableArrayList();
        c = dbTransport.getDbConnection();
        ResultSet rs = null;
        String SQL = "SELECT id_employee FROM carshowroom.employee";
        try {
            rs = c.createStatement().executeQuery(SQL);
            while (rs.next()){
                ObservableList<String> row = FXCollections.observableArrayList();
                for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++){
                    row.add(rs.getString(i));
                }
                data1.add(row);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    private void choseVIN(){
        Connection c;
        DataBaseHandlerTransport dbTransport = new DataBaseHandlerTransport();
        data = FXCollections.observableArrayList();
        c = dbTransport.getDbConnection();
        ResultSet rs = null;
        String SQL = "SELECT vin FROM carshowroom.transport";
        try {
            rs = c.createStatement().executeQuery(SQL);
            while (rs.next()){
                ObservableList<String> row = FXCollections.observableArrayList();
                for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++){
                    row.add(rs.getString(i));
                }
                data.add(row);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    private void addBuyer() {
        DataBaseHandlerPerson dbHandler = new DataBaseHandlerPerson();
        String first_name = first_name_buyer.getText();
        String midle_name = midle_name_buyer.getText();
        String last_name = last_name_buyer.getText();
        String birh = birth_buyer.getText();
        String gender = "";

        if(checkBoxMale.isSelected())
            gender = String.valueOf(Person.gender.MALE);
        else
            gender = String.valueOf(Person.gender.FEMALE);

        String phone = phone_buyer.getText();

        Buyer buyer = new Buyer(first_name,midle_name,last_name,birh,gender,phone);
        dbHandler.signUpUserB(buyer);
    }

}


