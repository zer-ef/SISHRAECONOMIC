/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.hra.properties;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Grimaldo
 */
public final class DBConnection {

    private static DBConnection _dbConnectionSingleton = null;
    private static Connection _conn = null;
    private final boolean _flag = true;

    /**
     * A private Constructor prevents any other class from instantiating.
     */
    private DBConnection() {
        if (_conn == null) {
            openConnection();
            System.out.println("Connected to the database");
        }
    }

    public Connection openConnection() {
        try {
            String CONFIG_FILE_NAME = "DBConnection.properties";
            Properties dbProperties;
            dbProperties = new Properties();
            InputStream is = getClass().getClassLoader().getResourceAsStream("/org/hra/properties/" + CONFIG_FILE_NAME);
            dbProperties.load(is);
            String server = dbProperties.getProperty("server");
            String url = dbProperties.getProperty("host") + ":";
            String port = dbProperties.getProperty("port");
            String dbName = dbProperties.getProperty("schema");
            String driver = dbProperties.getProperty("driver");
            String userName = dbProperties.getProperty("username");
            String password = dbProperties.getProperty("password");
            Class.forName(driver).newInstance();
            String cadena = "";
            if ("sqlserver".equals(server)) {
                cadena = url + port + ";databaseName=" + dbName + ";";
            }
            if ("mysql".equals(server)) {
                cadena = url + port + "/" + dbName + "";
            }
            if ("oracle".equals(server)) {
                cadena = url + port + "/" + dbName + "";
            }
            _conn = DriverManager.getConnection(cadena, userName, password);
        } catch (IOException | ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            _conn = null;
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error : " + ex.getMessage());
            _conn = null;
        }
        return _conn;
    }

    /**
     * Static 'instance' method
     *
     * @return
     */
    public static DBConnection getInstance() {
        synchronized (DBConnection.class) {
            if (_dbConnectionSingleton == null) {
                _dbConnectionSingleton = new DBConnection();
            }
        }
        /* if (_dbConnectionSingleton == null) {
         _dbConnectionSingleton = new DBConnection();
         }*/
        return _dbConnectionSingleton;
    }

    public boolean getConnectionStatus() {
        return _flag;
    }
}
