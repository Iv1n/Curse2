package DB;

import Prgr.Buyer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DataBaseHandlerBuyer extends ConfigsBuyer {
    Connection dbConnection;

    public Connection getDbConnection()
            throws ClassNotFoundException, SQLException {
        String connectionString = "jdbc:mysql://" + dbHost + ":"
                + dbPort + "/" + dbName;
        Class.forName("com.mysql.jdbc.Driver");
        dbConnection = DriverManager.getConnection(connectionString, dbUser,
                dbPass);
        return dbConnection;
    }

    /*public void signUpUser(String id_buyer, String first_name_buyer, String birth_buyer, String gender_buyer,
                           String midle_name_buyer, String last_name_biyer, String phone_number_buyer) {
        String insert = "INSERT INTO" + ConstBuyer.Person_TABLEB + " (" + ConstBuyer.Person_IDB + "," +
                ConstBuyer.Person_FNAME + "," + ConstBuyer.Person_BIRTH + "," + ConstBuyer.Person_GENDERB + "," +
                ConstBuyer.Person_MNAME + "," + ConstBuyer.Person_LNAME + "," + ConstBuyer.Person_PHONEB + ")" +
                "VALUES(?,?,?,?,?,?,?)";
        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(insert);
            prSt.setString(1, id_buyer);
            prSt.setString(2, first_name_buyer);
            prSt.setString(3, birth_buyer);
            prSt.setString(4, gender_buyer);
            prSt.setString(5, midle_name_buyer);
            prSt.setString(6, last_name_biyer);
            prSt.setString(7, phone_number_buyer);
            prSt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
*/
    public void signUpUser(Buyer buyer) {
        String insert = "INSERT INTO" + ConstBuyer.Person_TABLEB + " (" + ConstBuyer.Person_IDB + "," +
                ConstBuyer.Person_FNAME + "," + ConstBuyer.Person_BIRTH + "," + ConstBuyer.Person_GENDERB + "," +
                ConstBuyer.Person_MNAME + "," + ConstBuyer.Person_LNAME + "," + ConstBuyer.Person_PHONEB + ")" +
                "VALUES(?,?,?,?,?,?,?)";
        PreparedStatement prSt = null;
        try {
            prSt = getDbConnection().prepareStatement(insert);
            prSt.setString(1, buyer.getId());
            prSt.setString(2, buyer.getFirst_name());
            prSt.setString(3, buyer.getBirth());
            prSt.setObject(4, buyer.getGender());
            prSt.setString(5, buyer.getMiddle_name());
            prSt.setString(6, buyer.getLast_name());
            prSt.setString(7, buyer.getPhone_number());
            prSt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
