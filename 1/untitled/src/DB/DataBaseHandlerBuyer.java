package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DataBaseHandlerBuyer extends ConfigsBuyer {
    Connection dbConnection;

    public Connection getDbConnection()
            throws  ClassNotFoundException, SQLException{
        String connectionString = "jdbc:mysql://" + dbHost + ":"
                + dbPort + "/" + dbName;
        Class.forName("com.mysql.jdbc.Driver");
        dbConnection = DriverManager.getConnection(connectionString, dbUser,
                dbPass);
        return dbConnection;
    }

    public void signUpUser(String id, String name, String birth, String gender){
        String insert = "INSERT INTO" + ConstBuyer.Person_TABLE + " (" + ConstBuyer.Person_ID + "," +
                ConstBuyer.Person_BIRTH + "," + ConstBuyer.Person_GENDER+ "," + ConstBuyer.Person_NAME + ")" +
        "VALUES(?,?,?,?)";
        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(insert);
            prSt.setString(1, id);
            prSt.setString(2, name);
            prSt.setString(3, birth);
            prSt.setString(4, gender);
            prSt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }



}
