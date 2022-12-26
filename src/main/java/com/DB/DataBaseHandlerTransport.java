package com.DB;


import com.example.carshowroom.Buyer;
import com.example.carshowroom.Car;
import com.example.carshowroom.Employee;
import com.example.carshowroom.Transport;
import javafx.collections.ObservableList;

import java.sql.*;

import static com.example.carshowroom.Buyer.id_buyer;

public class DataBaseHandlerTransport extends Config {
    private static Connection con;
    private PreparedStatement preparedStatement;
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

    public ResultSet getTransport(String data) {
        String getUser = "SELECT id,typeTC,brandTC,modelTC,vin,dateOfManufacture,prise FROM carshowroom." + data + " WHERE id_owner=0";
        PreparedStatement prSt = null;
        try {
            prSt = getDbConnection().prepareStatement(getUser);
            rs = prSt.executeQuery();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return rs;
    }
    public void sellTC(int id_buyer,String vin, int id){
        try{
            getDbConnection();
            String insert = "UPDATE carshowroom.transport SET id_owner=" + "'" + id_buyer + "'" +" , id_employee=" + "'" +id+ "'" + " WHERE vin=" + "'" + vin + "'";
            preparedStatement = getDbConnection().prepareStatement(insert);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    public ResultSet getTC(String data, String data1) {
        String getUser = "SELECT id,brandTC,modelTC,vin,dateOfManufacture,prise FROM carshowroom." + data + " WHERE typeTC=" + "'" + data1
                + "'" + "AND id_owner=0";
        PreparedStatement prSt = null;
        try {
            prSt = getDbConnection().prepareStatement(getUser);
            rs = prSt.executeQuery();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return rs;
    }

    public void editTransport(String newBrandTC, String newModelTC, String newVin, String newDateOfManufacture,int newPrise, int id){
String Update = "UPDATE carshowroom.transport set brandTC=" + "'" + newBrandTC + "'" + ",modelTC=" + "'" + newModelTC + "'" +
        ",vin=" + "'" + newVin + "'" + ",dateOfManufacture=" + "'" + newDateOfManufacture + "'" + ",prise=" + "'" + newPrise + "'" + "" +
        "WHERE id=" + id;
try {
    preparedStatement = getDbConnection().prepareStatement(Update);
    preparedStatement.executeUpdate();
} catch (SQLException e) {
    throw new RuntimeException(e);
}
    }

    public ResultSet getTableSaleOwner(){
        String getTable = "SELECT * FROM carshowroom.transport WHERE id_employee>0 AND id_owner<>0";
        PreparedStatement prSt = null;
        try {
            prSt = getDbConnection().prepareStatement(getTable);
            rs = prSt.executeQuery();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return rs;
    }

    public ResultSet tableMain(){
        String getTable = "SELECT id_owner, id, typeTC, brandTC, modelTC, vin, dateOfManufacture FROM carshowroom.transport where id_owner>0";
        PreparedStatement prSt = null;
        try {
            prSt = getDbConnection().prepareStatement(getTable);
            rs = prSt.executeQuery();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return rs;
    }


    public void signUpTC(Car car) {
        String insert = "INSERT INTO carshowroom.transport (id_owner, typeTC, brandTC," +
                "modelTC,vin,dateOfManufacture,prise) VALUES(?,?,?,?,?,?,?)";
        try {
            preparedStatement = getDbConnection().prepareStatement(insert);
            System.out.println(car.getId_owner());
            preparedStatement.setInt(1, car.getId_owner());
            preparedStatement.setString(2, car.getTypeTC());
            preparedStatement.setString(3, car.getBrandTC());
            preparedStatement.setString(4, car.getModelTC());
            preparedStatement.setString(5, car.getVin());
            preparedStatement.setString(6, car.getDateOfManufacture());
            preparedStatement.setInt(7, car.getPrise());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void delete(String Table, String id){
        try{
            getDbConnection();
            stmt = con.createStatement();
            stmt.executeUpdate("DELETE FROM carshowroom." + Table + " WHERE id=" + id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
