package Aula12.Ex1;

import java.sql.*;
import java.util.*;

// Uso local, alterar senha antes de usar 
public class ConexãoBd {
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e){
            throw new RuntimeException(e);
        }
    }

    public static Connection conectar() throws SQLException {
        String servidor = "localhost";
        String porta = "3306";
        String database = "tutorial";
        String username = "root";
        String senha = " ";
        
        
        return DriverManager.getConnection("jdbc:mysql://" + servidor + ":" + porta + "/" 
        + database + "?user=" + username + "&password=" + senha); 
    }
    public static void desconectar(Connection conn) throws SQLException{
        conn.close();
    }
    public void incluir(Connection conn){
        String sqlInsert = "INSERT INTO cliente(id, name,fone) VALUES (?, ?, ?)";

        try(PreparedStatement stm = conn.prepareStatement(sqlInsert)){
            stm.setInt(1, getIdCliente());
            stm.setString(2, getNome());
            stm.setString(3, getFone());
            stm.execute()
        }catch(Exception e){
            e.printStackTrace();
            try{
                conn.rollback();
            }catch( SQLException e1){
                System.out.print(e1.getStackTrace());
            }
        }
    }
    public void excluir(Connection conn){
        String sqlDelete = "DELETE FROM cliente WHERE id = ?";
        try(PreparedStatement stm = conn.prepareStatement(sqlDelete)){
            stm.setInt(1, getIdCliente());
            stm.execute();
        }catch (Exception e){
            e.printStackTrace();
            try{
                conn.rollback();
            }catch(SQLException e1){
                System.out.print(e1.getMessage());
            }
        }
    }
    public void carregar(Connection conn){
        String sqlSelect = "SELECT * FROM cliente WHERE cliente.id = ?";
        
        try(PreparedStatement ps = conn.prepareStatement(sqlSelect);){
            ps.setInt(1, getIdCliente());
            try(ResultSet rs = ps.executeQuery();){
                if(rs.next()){
                    this.setNome(rs.getString(2));
                    this.setFone(rs.getString(3));
                }
            }catch (Exception e){
                e.printStackTrace();
            } 
        }catch( SQLException e1 ){
            System.out.println(e1.getStackTrace());
        }
    }
    public ArrayList<Client> buscarClients(Connection conn){
        Strin
    }
}
