package DAO;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author André Schwerz
 */
public abstract class DbConnection {
    
    public Connection getMyConnection() throws SQLException, ClassNotFoundException, IOException {
        Class.forName("com.mysql.jdbc.Driver");
        return DriverManager.getConnection(Config.URL, Config.LOGIN, Config.PASSWORD);
    }
   
    public Connection connect(){
        try {
            return this.getMyConnection();
        } catch (IOException | ClassNotFoundException | SQLException ex) {
             System.out.println(ex.getMessage());
             return null;
        }
    }
    public void close(Connection con){
        try {
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}