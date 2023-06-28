/**
 * Utility class for managing database connections.
 */
package com.flipkart.utils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtils {

    private static Connection connection = null;

    /**
     * Retrieves a database connection.
     *
     * @return The database connection.
     */
    public static Connection getConnection() {

        if (connection != null)
            return connection;
        else {
            try {
//                Properties prop = new Properties();
//                InputStream inputStream = DBUtils.class.getClassLoader().getResourceAsStream("config.properties");
//                prop.load(inputStream);
                String driver = "com.mysql.cj.jdbc.Driver";
                String url = "jdbc:mysql://host.docker.internal:3306/GMS_db";
                String user = "root";
                String password = "ism2001@";
                Class.forName(driver);
                connection = DriverManager.getConnection(url, user, password);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            } //catch (FileNotFoundException e) {
//                e.printStackTrace();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
            return connection;
        }
    }
}