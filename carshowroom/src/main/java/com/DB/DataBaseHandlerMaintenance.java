package com.DB;

import java.sql.*;

public class DataBaseHandlerMaintenance extends Config {
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

    public void addWorcks(com.Prgr.Maintenance maintenance) {
        String insert = "INSERT INTO carshowroom.maintenance (id, id_trunsport, id_owner, dateOfFormation," +
                "id_employee,prise, nameWorcks, mileage) VALUES(?,?,?,?,?,?,?,?)";
        try {
            preparedStatement = getDbConnection().prepareStatement(insert);
            preparedStatement.setInt(1, maintenance.getId());
            preparedStatement.setInt(2, maintenance.getId_trunsport());
            preparedStatement.setInt(3, maintenance.getId_owner());
            preparedStatement.setString(4, maintenance.getDateOfFormation());
            preparedStatement.setInt(5, maintenance.getId_employee());
            preparedStatement.setInt(6, maintenance.getPrise());
            preparedStatement.setString(7, maintenance.getNameWorcks());
            preparedStatement.setInt(8, maintenance.getMileage());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void Deleteworcks(){
        try{
            getDbConnection();
            stmt = con.createStatement();
            stmt.executeUpdate("DELETE FROM maintenance WHERE id=6");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void ConclusionOfMaintenance()  {
        try {
            getDbConnection();
            stmt = con.createStatement();
            rs = stmt.executeQuery("select id, id_trunsport, id_owner, dateOfFormation, +" +
                    "id_employee,prise, nameWorcks, mileage from carshowroom.maintenance");//SQL запрос на вывод Работника

            while (rs.next()) {
                int id = rs.getInt(1);
                int id_trunsport = rs.getInt(2);
                int id_owner = rs.getInt(3);
                String dateOfFormation = rs.getString(4);
                int id_employee = rs.getInt(5);
                int prise = rs.getInt(6);
                String nameWorks = rs.getString(7);
                int mileage = rs.getInt(8);

                System.out.println("id :" + id + " id_trunsport :" + id_trunsport + " id_owner :" + id_owner +
                        " dateOfFormation :" + dateOfFormation +  " id_employee :" + id_employee + " prise :" + prise +
                        " nameWorks :" + nameWorks + "mileage" + mileage);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}
