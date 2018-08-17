package de.lubowiecki.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author T.Lubowiecki
 */
public class DbTest {
    
    public static void main(String[] args) {
        
        delete(1);
        show();
    }
    
    private static void show(int id) {
        
        String sql = "SELECT * FROM tools WHERE id = ?";
        
        try(Connection dbh = getConnection(); 
                PreparedStatement stmt = dbh.prepareStatement(sql)) {
            
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            printResults(rs);
        }
        catch(SQLException ex) {
            System.out.println(ex.getLocalizedMessage());
        }
    }
    
    private static void delete(int id) {
        
        String sql = "DELETE FROM tools WHERE id = ?";
        
        try(Connection dbh = getConnection(); 
                PreparedStatement stmt = dbh.prepareStatement(sql)) {
            
            stmt.setInt(1, id);
            int count = stmt.executeUpdate();
            System.out.println("Es wurden " + count + " Datensätze gelöscht.");
            
        }
        catch(SQLException ex) {
            System.out.println(ex.getLocalizedMessage());
        }
        
    }
    
    private static void show() {
        
        try(Connection dbh = getConnection(); 
                Statement stmt = dbh.createStatement()) {
            
            ResultSet rs = stmt.executeQuery("SELECT * FROM tools");
            printResults(rs);
        }
        catch(SQLException ex) {
            System.out.println(ex.getLocalizedMessage());
        }
        
    }
    

    private static Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_test", "root", "");
    }
    
    private static void printResults(ResultSet rs) throws SQLException {
        
        System.out.printf("%5s %15s %15s %10s kg %n",
                "ID",
                "NAME",
                "TYPE",
                "WEIGHT"
        );
        System.out.println("----------------------------------------------------------");
        
        while(rs.next()) {
            System.out.printf("%5s %15s %15s %10s kg %n",
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getString("type"),
                    rs.getString("weight")
            );
        }
    }
}
