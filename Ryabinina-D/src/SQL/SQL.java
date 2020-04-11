package SQL;

import java.sql.*;

public class SQL {
    public static void main(String[] args) {
        Connection connection=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://Localhost:3306/primer1?serverTimezone=UTC", "root", "йцукен");
            Statement stmt =connection.createStatement();
            ResultSet result=stmt.executeQuery("select * from book");
            while(result.next()){
                System.out.println("Номер строки: "+result.getRow() +"\n номер "+result.getInt(1)+" книга: "+result.getNString(2)+ " автор: "+result.getString("author" +
                        ""));
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
