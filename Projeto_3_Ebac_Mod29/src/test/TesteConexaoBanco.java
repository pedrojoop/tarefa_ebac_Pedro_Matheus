package test;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author pmpedrolima@gmail.com
 */
public class TesteConexaoBanco {

    /**
     * Cria uma instância
     *
     * @param args
     */
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:postgresql://localhost:5433/vendas_online_2";
        String usuario = "postgres";
        String senha = "postgres";

        try {
            // Carregar o driver JDBC
            Class.forName("org.postgresql.Driver");

            // Estabelecer a conexão com o banco de dados
            Connection conexao = DriverManager.getConnection(jdbcUrl, usuario, senha);

            // Verificar se a conexão foi bem-sucedida
            if (conexao != null) {
                System.out.println("Conexão bem-sucedida!");
                conexao.close();
            } else {
                System.out.println("Falha na conexão.");
            }

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
