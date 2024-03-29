package com.example.carshowroom;

import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import com.example.carshowroom.DataBase.DataBaseHandlerPerson;
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
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

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
    private TableColumn<com.example.carshowroom.Employee, String> Birth;

    @FXML
    private TableView<Employee> Employee;

    @FXML
    private Button buttonBack;

    @FXML
    private TableColumn<Employee, String> firstNameEmployee;

    @FXML
    private TableColumn<Employee, String> gender;

    @FXML
    private Button UpdateButton;

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
        setD();
        changeE();

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
        dellEmployee.setOnAction(event -> {
            dell();
            Employee.getItems().clear();
            setD();
            dataBase();
        });
        UpdateButton.setOnAction(event -> {
            try {
                Employee.getItems().clear();
                setD();
                dataBase();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
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
    private void setD(){
        idEmployee.setCellValueFactory(new PropertyValueFactory<>("id"));
        firstNameEmployee.setCellValueFactory(new PropertyValueFactory<>("first_name"));
        midleNameEmployee.setCellValueFactory(new PropertyValueFactory<>("middle_name"));
        laastNameEmployee.setCellValueFactory(new PropertyValueFactory<>("last_name"));
        Birth.setCellValueFactory(new PropertyValueFactory<>("birth"));
        gender.setCellValueFactory(new PropertyValueFactory<>("gender"));
        phoneNumberEmployee.setCellValueFactory(new PropertyValueFactory<>("phone_number"));
        Employee.setItems(data);
    }
    private void dell(){
        Employee employee = Employee.getSelectionModel().getSelectedItem();
        int id = employee.getId();
        String str = String.valueOf(id);
        String Table ="employee";
        String name = "id_employee";
        System.out.println(employee.getId());
        Object selectedItems = Employee.getSelectionModel().getSelectedItems();
        Employee.getItems().remove(selectedItems);
        dataBase.delete(Table,str,name);
    }
    private void changeE(){
        changeEmployee.setOnAction(e->{
            try{
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("EditEmployee.fxml"));
                Parent root = fxmlLoader.load();
                EditEmployee controller = fxmlLoader.getController();
                controller.setE(Employee.getSelectionModel().getSelectedItem());
                Stage stage = new Stage();
                stage.initStyle(StageStyle.DECORATED);
                stage.setResizable(false);
                stage.initModality(Modality.APPLICATION_MODAL);
                stage.initStyle(StageStyle.UNIFIED);
                stage.setTitle("Редактирование");
                stage.setScene(new Scene(root));
                stage.showAndWait();
                Employee.getItems().clear();
                dataBase();
            } catch (IOException ex) {
                System.err.println("Ошибка открытия формы редактивания: " + ex.getMessage());
                ex.printStackTrace();
            }
        });
    }
}
