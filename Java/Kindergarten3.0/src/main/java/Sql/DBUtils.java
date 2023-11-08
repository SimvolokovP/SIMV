package Sql;



import com.mysql.cj.jdbc.NonRegisteringDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtils {
    private static final String dbURL = "jdbc:mysql://localhost:3306/kindergarten";
    private static final String dbUsername = "admin";
    private static final String dbPassword = "admin";
    public static Connection getConnection() {

        Connection connection = null;
        try {
            Driver driver = new NonRegisteringDriver();
            DriverManager.registerDriver(driver);
            connection = DriverManager.getConnection(dbURL, dbUsername, dbPassword);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }
}


