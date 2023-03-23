package lk.ijse.dep10.git.db;

import javafx.scene.control.Alert;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection {
    private static DBConnection dbConnection;
    private final Connection connection;


    private DBConnection(){
        try {
            File file = new File("/application.properties");
            FileReader fr = new FileReader(file);
            Properties properties = new Properties();
            properties.load(fr);

            String host = properties.getProperty("mysql.host","localhost");
            String port = properties.getProperty("mysql.port","3306");
            String database = properties.getProperty("mysql.database","dep10_git");
            String userName = properties.getProperty("mysql.username","root");
            String password = properties.getProperty("mysql.password","");

            String url = String.format("jdbc:mysql://%s:%s/%s",host,port,database);

            connection = DriverManager.getConnection(url,userName,password);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (FileNotFoundException e) {
            new Alert(Alert.AlertType.ERROR, "Failed to read application file").showAndWait();
            throw new RuntimeException(e);
        } catch (IOException e) {
            new Alert(Alert.AlertType.ERROR, "Failed to load application file").showAndWait();
            throw new RuntimeException(e);
        }
    }
    public static DBConnection getInstance(){
        return (dbConnection == null) ? dbConnection = new DBConnection() : dbConnection;
    }
    public Connection connection(){
        return connection;
    }
}
