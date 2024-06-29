package devthepaulcode.projetospringdatajpa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnectionTest {

    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/dml";
        String username = "root";
        String password = "90Wg!dev";

        try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password)) {
            if (connection != null) {
                System.out.println("\n\tConectado ao banco de dados!");
            } else {
                System.out.println("\n\tFalha na conexão com o banco de dados!");
            }
        } catch (SQLException e) {
            System.err.println("\n\tSQL Exception: " + e.getMessage());
        }
    }
}