package WorkingWithFilesAndDBs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DB {
    public static void main(String[] args) {
        Connection connection = null;
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String jdbcUrl = "jdbc:mysql://localhost:3306/mydb";
            String userName = "root";
            String password = "your password";

            connection = DriverManager.getConnection(jdbcUrl, userName, password);
            System.out.println("Connected!");

            Statement st = connection.createStatement();
            String query = "SELECT * from `mytable`";
            ResultSet result = st.executeQuery(query);
            while(result.next()){
                System.out.println("ID: " + result.getInt(1) + "\t" +
                                   "DATA: " + result.getString(2));
            }
            st.close();
            connection.close();

        }catch(Exception e){
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
