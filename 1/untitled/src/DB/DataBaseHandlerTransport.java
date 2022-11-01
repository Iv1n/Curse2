package DB;

import Prgr.Car;
import Prgr.Truck;

import java.sql.*;

public class DataBaseHandlerTransport extends Config{
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

    public void addCar(Car car) {
        String insert = "INSERT INTO carshowroom.car (id_owner, brandCar, modelCar," +
                "vin,dateOfMnufacture,prise) VALUES(?,?,?,?,?,?)";
        try {
            preparedStatement = getDbConnection().prepareStatement(insert);
            preparedStatement.setInt(1,car.getId_owner());
            preparedStatement.setString(2, String.valueOf(car.getBrandCar()));
            preparedStatement.setString(3, String.valueOf(car.getModelCar()));
            preparedStatement.setString(4, car.getVin());
            preparedStatement.setString(5, car.getDateOfmMnufacture());
            preparedStatement.setInt(6, car.getPrise());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
 public void addTruck(Truck truck) {
        String insert = "INSERT INTO carshowroom.Truck (id_owner, brandTruck, modelTruck," +
                "vin,dateOfMnufacture,prise) VALUES(?,?,?,?,?,?)";
        try {
            preparedStatement = getDbConnection().prepareStatement(insert);
            preparedStatement.setInt(1,truck.getId_owner());
            preparedStatement.setString(2, String.valueOf(truck.getBrandTruck()));
            preparedStatement.setString(3, String.valueOf(truck.getModelTruck()));
            preparedStatement.setString(4, truck.getVin());
            preparedStatement.setString(5, truck.getDateOfmMnufacture());
            preparedStatement.setInt(6, truck.getPrise());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

 public void DeleteCar(){
        try{
            getDbConnection();
            stmt = con.createStatement();
            stmt.executeUpdate("DELETE FROM car WHERE id=4");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
 public void DeleteTruck(){
        try{
            getDbConnection();
            stmt = con.createStatement();
            stmt.executeUpdate("DELETE FROM truck WHERE id=6");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

 public void ConclusionOfCar()  {
        try {
            getDbConnection();
            stmt = con.createStatement();
            rs = stmt.executeQuery("select id, id_owner, brandCar, modelCar," +
                "vin,dateOfMnufacture,prise from carshowroom.car");//SQL запрос на вывод Работника

            while (rs.next()) {
                int id = rs.getInt(1);
                int id_owner = rs.getInt(2);
                String brandCar = rs.getString(3);
                String modelCar = rs.getString(4);
                String vin = rs.getString(5);
                String dateOfMnufacture = rs.getString(6);
                int prise = rs.getInt(7);

                System.out.println("id :" + id + " id_owner :" + id_owner + " branCar :" + brandCar +
                        " modelCar :" + modelCar +  " vin :" + vin + " dateOfMnufacture :" + dateOfMnufacture +
                       " prise :" + prise);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

 public void ConclusionOfTruck()  {
        try {
            getDbConnection();
            stmt = con.createStatement();
            rs = stmt.executeQuery("select id, id_owner, brandTruck, modelTruck," +
                "vin,dateOfMnufacture,prise from carshowroom.truck");//SQL запрос на вывод Работника

            while (rs.next()) {
                int id = rs.getInt(1);
                int id_owner = rs.getInt(2);
                String brandTruck = rs.getString(3);
                String modelTruck = rs.getString(4);
                String vin = rs.getString(5);
                String dateOfMnufacture = rs.getString(6);
                int prise = rs.getInt(7);

                System.out.println("id :" + id + " id_owner :" + id_owner + " branTruck :" + brandTruck +
                        " modelTruck :" + modelTruck +  " vin :" + vin + " dateOfMnufacture :" + dateOfMnufacture +
                       " prise :" + prise);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


}
