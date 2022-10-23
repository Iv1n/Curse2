package DB;

import Prgr.Car;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DataBaseHandlerTransport extends Config{
    private static Connection con;
    private PreparedStatement preparedStatement;
    public Connection getDbConnection() {
        try {
            con = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return con;
    }

    public void addCar(Car car) {
        String insert = "INSERT INTO carshowroom.car (id, id_owner, brandCar, modelCar," +
                "vin,dateOfMnufacture,prise) VALUES(?,?,?,?,?,?,?)";
        try {
            preparedStatement = getDbConnection().prepareStatement(insert);
            preparedStatement.setInt(1, car.getId());
            preparedStatement.setInt(2,car.getId_owner());
            preparedStatement.setString(3, car.getBrandCar().toString());
            preparedStatement.setString(4, car.getModelCar().toString());
            preparedStatement.setString(5, car.getVin());
            preparedStatement.setString(6, car.getDateOfmMnufacture());
            preparedStatement.setInt(7, car.getPrise());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }









}
