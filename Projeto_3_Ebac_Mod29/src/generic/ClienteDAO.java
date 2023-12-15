package generic;

import domain.Cliente;
import jbdc.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author pmpedrolima@gmail.com
 */
public class ClienteDAO implements IClienteDAO {

    /**
     * Construtor da classe ClienteDAO para conexão com o banco de dados
     * Cadastrar um novo registro no banco de dados
     *
     * @param cliente
     * objeto {@link Cliente} que representa o cliente a ser cadastrado
     * @return
     * @throws Exception
     */
    @Override
    public Integer cadastrar(Cliente cliente) throws Exception {
        Connection connection = null;
        PreparedStatement stm = null;
        try {
            connection = ConnectionFactory.getConnection();
            String sql = getSqlInsert();
            stm = connection.prepareStatement(sql);
            adicionarParametrosInsert(stm, cliente);
            return stm.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            closeConnection(connection, stm, null);
        }
    }

    /**
     * Construtor da classe ClienteDAO para fechar conexão com o banco de dados
     *
     * @param connection
     *
     * @param rs
     *
     * @param stm
     */
    private void closeConnection(Connection connection, PreparedStatement stm, ResultSet rs) {
        try {
            if(rs != null &&!rs.isClosed()) {
                rs.close();
            }
            if(stm != null &&!stm.isClosed()) {
                stm.close();
            }
            if(connection!= null &&!connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e1) {
            e1.printStackTrace();
        }
    }

    /**
     * construir sql para inserir um novo registro
     *
     * @return
     */
    private String getSqlInsert() {
        StringBuilder sb = new StringBuilder();
        sb.append("INSERT INTO TB_CLIENTE_2 (ID, CODIGO, NOME) ");
        sb.append(" VALUES (nextval('SQ_CLIENTE_2'),?,?)");
        return sb.toString();
    }

    /**
     * adicionar valores no postgres
     *
     * @param stm
     *
     * @param cliente
     *
     * @throws SQLException
     */
    private void adicionarParametrosInsert(PreparedStatement stm, Cliente cliente) throws SQLException {
        stm.setString(1, cliente.getCodigo());
        stm.setString(2, cliente.getNome());
    }

    /**
     * construir sql para atualizar um registro
     *
     * @param cliente
     */
    @Override
    public Integer atualizar(Cliente cliente) throws Exception {
        Connection connection = null;
        PreparedStatement stm = null;
        try {
            connection = ConnectionFactory.getConnection();
            String sql = getSqlUpdate();
            stm = connection.prepareStatement(sql);
            adicionarParametrosUpdate(stm, cliente);
            return stm.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            closeConnection(connection, stm, null);
        }
    }

    /**
     * construir sql para atualizar um registro
     *
     * Adiciona os parametros de UPDATE no banco de dados
     *
     * @param stm
     *
     * @param cliente
     */
    private void adicionarParametrosUpdate(PreparedStatement stm, Cliente cliente) throws SQLException {
        stm.setString(1, cliente.getNome());
        stm.setString(2, cliente.getCodigo());
        stm.setLong(3, cliente.getId());
    }

    /**
     * construir sql para atualizar um registro
     *
     * Cria o comando para UPDATE baseado no ID
     *
     * @return
     */
    private String getSqlUpdate() {
        StringBuilder sb = new StringBuilder();
        sb.append("UPDATE TB_CLIENTE_2 ");
        sb.append("SET NOME =?, CODIGO =? ");
        sb.append("WHERE ID =?");
        return sb.toString();
    }

    /**
     * Consulta cliente pelo codigo
     *
     * @param codigo
     *
     * código do cliente a ser buscado
     *
     * @return cliente
     *
     * @throws Exception
     */
    @Override
    public Cliente buscar(String codigo) throws Exception {
        Connection connection = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        Cliente cliente = null;
        try {
            connection = ConnectionFactory.getConnection();
            String sql = getSqlSelect();
            stm = connection.prepareStatement(sql);
            adicionarParametrosSelect(stm, codigo);
            rs = stm.executeQuery();
            if(rs.next()) {
                cliente = new Cliente();
                cliente.setId(rs.getLong("ID"));
                cliente.setNome(rs.getString("NOME"));
                cliente.setCodigo(rs.getString("CODIGO"));
            }
        } catch (Exception e) {
            throw e;
        } finally {
            closeConnection(connection, stm, rs);
        }
        return cliente;
    }

    /**
     * construir sql para atualizar um registro
     *
     * Adiciona os parametros de SELECT no banco de dados
     *
     * @param stm
     *
     * @param codigo
     */
    private void adicionarParametrosSelect(PreparedStatement stm, String codigo) throws SQLException {
        stm.setString(1, codigo);
    }

    /**
     * construir sql para consultar todos os registros
     *
     * @return
     */
    private String getSqlSelect() {
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT * FROM TB_CLIENTE_2 ");
        sb.append("WHERE CODIGO =?");
        return sb.toString();
    }

    /**
     * Construtor da classe ClienteDAO para excluir um registro
     *
     * @param cliente
     *
     * @throws Exception
     */
    @Override
    public Integer excluir(Cliente cliente) throws Exception {
        Connection connection = null;
        PreparedStatement stm = null;
        try {
            connection = ConnectionFactory.getConnection();
            String sql = getSqlDelete();
            stm = connection.prepareStatement(sql);
            adicionarParametrosDelete(stm, cliente);
            return stm.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            closeConnection(connection, stm, null);
        }
    }

    /**
     * Adiciona os parametros de DELETE no banco de dados
     *
     * @param stm
     */
    private void adicionarParametrosDelete(PreparedStatement stm, Cliente cliente) throws SQLException {
        stm.setString(1, cliente.getCodigo());
    }

    /**
     * Construir sql para deletar um registro pelo ID
     *
     * @return
     */
    private String getSqlDelete() {
        StringBuilder sb = new StringBuilder();
        sb.append("DELETE FROM TB_CLIENTE_2 ");
        sb.append("WHERE CODIGO = ?");
        return sb.toString();
    }

    /**
     * Construir sql para consultar todos os registros
     *
     * @return lista de clientes
     *
     * @throws Exception
     */
    @Override
    public List<Cliente> buscarTodos() throws Exception {
        Connection connection = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        List<Cliente> list = new ArrayList<>();
        try {
            connection = ConnectionFactory.getConnection();
            String sql = getSqlSelectAll();
            stm = connection.prepareStatement(sql);
            rs = stm.executeQuery();

            while(rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setId(rs.getLong("ID"));
                cliente.setNome(rs.getString("NOME"));
                cliente.setCodigo(rs.getString("CODIGO"));
                list.add(cliente);
            }

        } catch (Exception e) {
            throw e;
        } finally {
            closeConnection(connection, stm, rs);
        }
        return list;
    }

    /**
     * Construir sql para consultar todos os registros
     *
     * @return String de DQL
     */
    private String getSqlSelectAll() {
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT * FROM TB_CLIENTE_2 ");
        return sb.toString();
    }
}
