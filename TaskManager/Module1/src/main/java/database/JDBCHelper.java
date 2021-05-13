package database;


import properties.MyProperties;

import java.sql.*;

public class JDBCHelper {
    private static Connection connection;
    private static MyProperties properties = new MyProperties();

    public static Connection getConnection() throws SQLException {

        String url = properties.getUrl();
        String name = properties.getName();
        String password = properties.getPassword();

        if (connection == null) {
            connection = DriverManager.getConnection(url, name, password);
        } else {
            return connection;
        }
        return connection;
    }

    public static void closeConnection(Connection con) throws SQLException {
        if (con != null) {
            con.close();
        }
    }

    public static void closePreparedStatement(PreparedStatement stmt) throws SQLException {
        if (stmt != null) {
            stmt.close();
        }
    }

    public static void closeResultSet(ResultSet rs) throws SQLException {
        if (rs != null) {
            rs.close();
        }
    }
}
