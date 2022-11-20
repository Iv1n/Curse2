package com.DB;

import com.Prgr.Transport;

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

 /* public ResultSet ConclusionOfTransport(String transport) {
     ResultSet resSet = null;
     String getInfo = "select typeTC, brandTC, modelTC," +
             "dateOfManufacture,prise from carshowroom.transport WHERE vin=" + "'" + infTransport + "'";
     try {
     PreparedStatement prSt = getDbConnection().prepareStatement(getInfo);
     prSt.setString(1, Transport.getTypeTC);
     prSt.setString(2, Transport.getBrandTC);
     prSt.setString(3, Transport.getModleTC);
     prSt.setString(4, Transport.getDateOfmManufacture);
     prSt.setString(5, Transport.getPrise);

         resSet = prSt.executeQuery();
     } catch (SQLException e) {
         throw new RuntimeException(e);
     }

     return resSet;
 }

  */
}
