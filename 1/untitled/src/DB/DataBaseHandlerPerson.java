package DB;

import java.sql.*;

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

    public void signUpUserB(Prgr.Buyer buyer) {
        String insert = "INSERT INTO carshowroom.buyer (id_buyer, first_name_buyer, midle_name_buyer, last_name_buyer," +
                "birth_buyer,gender_buyer, phone_number_buyer) VALUES(?,?,?,?,?,?,?)";
        try {
            preparedStatement = getDbConnection().prepareStatement(insert);
            preparedStatement.setInt(1, buyer.getId());
            preparedStatement.setString(2, buyer.getFirst_name());
            preparedStatement.setString(3, buyer.getMiddle_name());
            preparedStatement.setString(4, buyer.getLast_name());
            preparedStatement.setString(5, buyer.getBirth());
            preparedStatement.setString(6, buyer.getGender());
            preparedStatement.setString(7, buyer.getPhone_number());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void signUpUserE(Prgr.Employee employee) {
        String insert = "INSERT INTO carshowroom.employee (id_employee, first_name_employee, midle_name_employee, last_name_employee," +
                "birth_employee,gender_employee, phone_number_employee) VALUES(?,?,?,?,?,?,?)";
        try {
            preparedStatement = getDbConnection().prepareStatement(insert);
            preparedStatement.setInt(1, employee.getId());
            preparedStatement.setString(2, employee.getFirst_name());
            preparedStatement.setString(3, employee.getMiddle_name());
            preparedStatement.setString(4, employee.getLast_name());
            preparedStatement.setString(5, employee.getBirth());
            preparedStatement.setString(6, employee.getGender());
            preparedStatement.setString(7, employee.getPhone_number());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

     public void DeleteBuyer(){
        try{
            getDbConnection();
            stmt = con.createStatement();
            stmt.executeUpdate("DELETE FROM buyer WHERE id_buyer=6");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void DeleteEmploy(){
        try{
            getDbConnection();
            stmt = con.createStatement();
            stmt.executeUpdate("DELETE FROM buyer WHERE id_employee=6");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public void ConclusionOfBuyer()  {
        try {
            getDbConnection();
            stmt = con.createStatement();
            rs = stmt.executeQuery("select id_buyer, first_name_buyer, midle_name_buyer, last_name_buyer," +
                    "birth_buyer,gender_buyer, phone_number_buyer from carshowroom.buyer");//SQL запрос на вывод Работника

            while (rs.next()) {
                int id_buy = rs.getInt(1);
                String first_name_buy = rs.getString(2);
                String middle_name_buy = rs.getString(3);
                String last_name_buy = rs.getString(4);
                String birth_buy = rs.getString(5);
                String gender_buy = rs.getString(6);
                String phone_number_buy = rs.getString(7);

                System.out.println("id :" + id_buy + " firts_name :" + first_name_buy + " midle_name :" + middle_name_buy +
                        " last_name :" + last_name_buy +  " birth :" + birth_buy + " gender :" + gender_buy +
                       " phone :" + phone_number_buy);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void ConclusionOfEmployee()  {
        try {
            getDbConnection();
            stmt = con.createStatement();
            rs = stmt.executeQuery("select id_employee, first_name_employee, midle_name_employee, last_name_employee," +
                    "birth_employee,gender_employee, phone_number_employee from carshowroom.employee");//SQL запрос на вывод Работника

            while (rs.next()) {
                int id_empl = rs.getInt(1);
                String first_name_empl = rs.getString(2);
                String middle_name_empl = rs.getString(3);
                String last_name_empl = rs.getString(4);
                String birth_empl = rs.getString(5);
                String gender_empl = rs.getString(6);
                String phone_number_empl = rs.getString(7);

                System.out.println("id :" + id_empl + " firts_name :" + first_name_empl + " midle_name :" + middle_name_empl +
                        " last_name :" + last_name_empl +  " birth :" + birth_empl + " gender :" + gender_empl +
                        " phone :" + phone_number_empl);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
