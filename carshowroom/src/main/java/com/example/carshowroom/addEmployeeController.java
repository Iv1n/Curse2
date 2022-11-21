package com.example.carshowroom;


import com.DB.DataBaseHandlerPerson;
import com.Prgr.Person;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

public class addEmployeeController {

    @FXML
    private Button addEmployee;

    @FXML
    private TextField dateOfBirth_employee;

    @FXML
    private CheckBox femaleBox;

    @FXML
    private TextField first_name_employee;

    @FXML
    private TextField last_name_employee;

    @FXML
    private CheckBox maleBox;

    @FXML
    private TextField midle_name_employee;

    @FXML
    private TextField phone_employee;
    @FXML
    void initialize() {
        addEmployee.setOnAction(event ->{
            addBuyer();
            addEmployee.getScene().getWindow().hide();
        });

    }
    private void addBuyer() {
        DataBaseHandlerPerson dbHandler = new DataBaseHandlerPerson();
        String first_name = first_name_employee.getText();
        String midle_name = midle_name_employee.getText();
        String last_name = last_name_employee.getText();
        String birh = dateOfBirth_employee.getText();
        String gender = "";

        if(maleBox.isSelected())
            gender = String.valueOf(Person.gender.MALE);
        else
            gender = String.valueOf(Person.gender.FEMALE);

        String phone = phone_employee.getText();

        Employee employee = new Employee(first_name,midle_name,last_name,birh,gender,phone);
        dbHandler.signUpUserE(employee);

    }
}
