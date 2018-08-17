package de.lubowiecki.designpatterns.singleton;

import java.sql.Connection;

/**
 *
 * @author T.Lubowiecki
 */
public class Singleton {
    
    public static void main(String[] args) {
        
        LazySingletonImpl lazy = LazySingletonImpl.getInstance();
        EagerSingletonImpl eager = EagerSingletonImpl.getInstance();
    }
}

// LAZY
class LazySingletonImpl {
    
    private static LazySingletonImpl instance; 
    
    private LazySingletonImpl() {
    }
    
    public static LazySingletonImpl getInstance() {
        if(instance == null) {
            instance = new LazySingletonImpl();
        }
        return instance;
    }
}

// EAGER
class EagerSingletonImpl {
    
    private static EagerSingletonImpl instance = new EagerSingletonImpl(); 
    
    private EagerSingletonImpl() {
    }
    
    public static EagerSingletonImpl getInstance() {
        return instance;
    }
}

class DBManager {

    private static DBManager instance;
    private Connection con;
    
    private DBManager() {
        // Aufbau der DB Verbindung
        //con = ....
    }
    
    public static Connection getConnection() {
        if(instance == null) {
            instance = new DBManager();
        }
        return instance.con;
    }
}

