package UniverseDB;

import java.sql.*;
public class UniverseDBConnector {
    private static Connection connection;
    private static final String user = "joch";
    private static final String pass = "1453";
    private static final String dbname = "Universe";

    public UniverseDBConnector(){

    }
    public static void main(String[] args) throws SQLException {

        openDatabaseConnection();
        closeDatabaseConnection();
    }

    public static void openDatabaseConnection() throws SQLException{
        System.out.println("Opening database connection...");

//        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Universe?user=joch&password=1453");
        connection = DriverManager.getConnection(
               "jdbc:mysql://localhost:3306/Universe",
                user, pass);

        System.out.println("Connection valid: " + connection.isValid(0));
    }

    public static void closeDatabaseConnection() throws SQLException {
        connection.close();
    }
}
