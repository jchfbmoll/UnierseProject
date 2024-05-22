package UniverseDB;

import Universe.Universe;

import java.sql.*;
import java.util.ArrayList;

public class UniverseDBConnector {
    private static Connection connection;
    private static final String user = "joch";
    private static final String pass = "1234";
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
    public static void guardarUniverso(Universe universo) throws SQLException {
        if (universo.getID()==-1){
            PreparedStatement stmt = connection.prepareStatement("INSERT INTO Universes(name, weight, time) VALUES (?, ?, ?)");

            stmt.setString(1, universo.getName());
            stmt.setLong(2, universo.getWeight());
            stmt.setLong(3, universo.getInitial_time());
            stmt.executeUpdate();
        }
    }
    public static ArrayList<Universe> cargarUniversos() throws SQLException {
        ArrayList<Universe> Universes = new ArrayList<>();

        String sql_res= "SELECT * FROM Universes";
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery(sql_res);
        System.out.println(rs);
        while (rs.next()) {

            Universe universe = new Universe();
            universe.setID(rs.getInt("id"));
            universe.setName(rs.getString("name"));
            universe.setWeight(rs.getLong("weight"));
            universe.setTime(rs.getLong("time"));
            Universes.add(universe);
        }

        return Universes;
    }
}
