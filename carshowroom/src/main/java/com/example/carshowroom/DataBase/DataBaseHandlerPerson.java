package com.example.carshowroom.DataBase;

import com.example.carshowroom.Buyer;
import com.example.carshowroom.Employee;

import java.sql.*;

import static com.example.carshowroom.Buyer.id_buyer;

public class DataBaseHandlerPerson extends Config {
    private PreparedStatement preparedStatement;
    private static Connection con;
    private static Statement stmt;
    private static ResultSet rs;

    public Connection getDbConnection() {
        try {
            con = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return con;
    }

    public void signUpUserB(Buyer buyer) {
        String insert = "INSERT INTO carshowroom.buyer (first_name_buyer, midle_name_buyer, last_name_buyer," +
                "birth_buyer,gender_buyer, phone_number_buyer) VALUES(?,?,?,?,?,?)";
        try {
            preparedStatement = getDbConnection().prepareStatement(insert);
            preparedStatement.setString(1, buyer.getFirst_name());
            preparedStatement.setString(2, buyer.getMiddle_name());
            preparedStatement.setString(3, buyer.getLast_name());
            preparedStatement.setString(4, buyer.getBirth());
            preparedStatement.setString(5, buyer.getGender());
            preparedStatement.setString(6, buyer.getPhone_number());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void signUpUserE(Employee employee) {
        String insert = "INSERT INTO carshowroom.employee (first_name_employee, midle_name_employee, last_name_employee," +
                "birth_employee,gender_employee, phone_number_employee) VALUES(?,?,?,?,?,?)";
        try {
            preparedStatement = getDbConnection().prepareStatement(insert);
            preparedStatement.setString(1, employee.getFirst_name());
            preparedStatement.setString(2, employee.getMiddle_name());
            preparedStatement.setString(3, employee.getLast_name());
            preparedStatement.setString(4, employee.getBirth());
            preparedStatement.setString(5, employee.getGender());
            preparedStatement.setString(6, employee.getPhone_number());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public void infBuyer(String phone){
        try {
            getDbConnection();
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT id_buyer FROM carshowroom.buyer WHERE phone_number_buyer =" + "'" + phone + "'");//SQL запрос на вывод Работника
            while (rs.next()) {
                id_buyer = rs.getInt(1);
                System.out.println(id_buyer);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public ResultSet getBuyer(String data){
        String getUser="SELECT * FROM carshowroom."+ data;
        PreparedStatement prSt=null;
        try{
            prSt= getDbConnection().prepareStatement(getUser);
            rs = prSt.executeQuery();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return rs;
    }

    public void delete(String Table, String id, String name){
        try{
            getDbConnection();
            stmt = con.createStatement();
            stmt.executeUpdate("DELETE FROM carshowroom." + Table + " WHERE " + name + "=" + id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void editBuyer(String firstName,String midleName,String lastName,String Birth,String phone,int id){
        String Update = "UPDATE carshowroom.buyer set first_name_buyer=" + "'" + firstName + "'" + ",midle_name_buyer=" + "'" + midleName + "'" +
                ",last_name_buyer=" + "'" + lastName + "'" + ",birth_buyer=" + "'" + Birth + "'" + ",phone_number_buyer=" + "'" + phone + "'" + "" +
                "WHERE id_buyer=" + id;
        try {
            preparedStatement = getDbConnection().prepareStatement(Update);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void editEmployee(String firstName,String midleName,String lastName,String Birth,String phone,int id){
        String Update = "UPDATE carshowroom.employee set first_name_employee=" + "'" + firstName + "'" + ",midle_name_employee=" + "'" + midleName + "'" +
                ",last_name_employee=" + "'" + lastName + "'" + ",birth_employee=" + "'" + Birth + "'" + ",phone_number_employee=" + "'" + phone + "'" + "" +
                "WHERE id_employee=" + id;
        try {
            preparedStatement = getDbConnection().prepareStatement(Update);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}

