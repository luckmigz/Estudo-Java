import java.sql.*;

public class Conn {

     { 
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } 
        catch (ClassNotFoundException e) { 
            throw new RuntimeException(e); 
        }
    }
    public  Connection connect() throws SQLException {
    
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/tutorial?user=root&root");
    }
    public  void desconnect(Connection conn) throws SQLException {
        conn.close();
    } 

}
