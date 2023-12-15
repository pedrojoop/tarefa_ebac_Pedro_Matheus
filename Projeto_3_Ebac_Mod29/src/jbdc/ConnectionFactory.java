package jbdc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author pmpedrolima@gmail.com
 */
public class ConnectionFactory {
    private static Connection connection;


    /**
     * Cria uma instância
     * @param connection
     */
    private ConnectionFactory(Connection connection) {

    }

    /**
     * Retorna uma instância de conexão com o banco de dados.
     *
     * @return a instância de connection com o banco de dados.
     */
    public static Connection getConnection() throws SQLException {
        if(connection == null) {
            connection = initConnection();
        } else if (connection != null && connection.isClosed()) {
            connection = initConnection();
        }
        return connection;
    }

    /**
     * inicializa uma conexão com o banco de dados.
     *
     * @init Connection com o banco de dados.
     */
    private static Connection initConnection() {
        try {
            return DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5433/vendas_online_2", "postgres", "postgres");
        } catch(SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
