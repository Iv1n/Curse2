package com.example.carshowroom;

import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import com.DB.DataBaseHandlerPerson;
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

public class EmployeeTable {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button addEmployee;

    @FXML
    private Button changeEmployee;

    @FXML
    private Button dellEmployee;
    @FXML
    private TableColumn<Employee, String> Birth;

    @FXML
    private TableView<Employee> Employee;

    @FXML
    private Button buttonBack;

    @FXML
    private TableColumn<Employee, String> firstNameEmployee;

    @FXML
    private TableColumn<Employee, String> gender;

    @FXML
    private TableColumn<Employee, Integer> idEmployee;

    @FXML
    private TableColumn<Employee, String> laastNameEmployee;

    @FXML
    private TableColumn<Employee, String> midleNameEmployee;

    @FXML
    private TableColumn<Employee, String> phoneNumberEmployee;
    DataBaseHandlerPerson dataBase = new DataBaseHandlerPerson();
    private final ObservableList<Employee> data= FXCollections.observableArrayList();

    @FXML
    void initialize() {
        dataBase();
        idEmployee.setCellValueFactory(new PropertyValueFactory<>("id"));
        firstNameEmployee.setCellValueFactory(new PropertyValueFactory<>("first_name"));
        midleNameEmployee.setCellValueFactory(new PropertyValueFactory<>("middle_name"));
        laastNameEmployee.setCellValueFactory(new PropertyValueFactory<>("last_name"));
        Birth.setCellValueFactory(new PropertyValueFactory<>("birth"));
        gender.setCellValueFactory(new PropertyValueFactory<>("gender"));
        phoneNumberEmployee.setCellValueFactory(new PropertyValueFactory<>("phone_number"));
        Employee.setItems(data);

        buttonBack.setOnAction(event -> {
            buttonBack.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            Parent root = null;
            try {
                root = FXMLLoader.load(getClass().getResource("buyer.fxml"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            Stage stage = new Stage();
            stage.setScene(new Scene(root, 320, 280));
            stage.setResizable(false);
            stage.show();
        });
        addEmployee.setOnAction(event -> {
            addEmployee.getScene();
            FXMLLoader loader = new FXMLLoader();
            Parent root = null;
            try {
                root = FXMLLoader.load(getClass().getResource("addEmployeeController.fxml"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            Stage stage = new Stage();
            stage.setScene(new Scene(root, 360, 320));
            stage.setResizable(false);
            stage.show();
        });

    }
    private void dataBase() {
        ResultSet users= dataBase.getBuyer("employee");
        try{
            while (users.next()){
                Employee employee= new Employee(
                        users.getInt(1),
                        users.getString(2),
                        users.getString(3),
                        users.getString(4),
                        users.getString(5),
                        users.getString(6),
                        users.getString(7));
                data.add(employee);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
