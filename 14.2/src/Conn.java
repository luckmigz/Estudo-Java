import  java.sql.Connection;
import  java.sql.DriverManager;
import  java.sql.PreparedStatement;
import  java.sql.ResultSet;
import  java.sql.SQLException;

public class Conn {
    private static final String URL  =   "jdbc:mysql://localhost:3306/tutorial";
    private static final String USER =   "root";
    private static final String PASS =   "root";
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String ERROBD = "Erro na conexão com o Banco de Dados: "; 


     public static  Connection connect()  {
       try{
        Class.forName(DRIVER);
        return DriverManager.getConnection(URL, USER, PASS);
       }catch(ClassNotFoundException | SQLException e) {
         throw new RuntimeException("Erro" + e); 
       }
    }
    public static void desconnect(Connection conn) throws SQLException {
        {   try
            {   if(conn != null) 
                {   conn.close();
                }
            } 
            catch(SQLException e) 
            {   throw new RuntimeException(ERROBD + e);
            }
        }    
    }
}
