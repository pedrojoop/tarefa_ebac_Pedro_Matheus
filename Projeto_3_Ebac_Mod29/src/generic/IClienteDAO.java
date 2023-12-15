package generic;

import domain.Cliente;

import java.util.List;

/**
 * @author pmpedrolima@gmail.com
 */
public interface IClienteDAO {
    /**
     * Cadastra um novo cliente
     *
     * @param cliente
     * objeto {@link Cliente} que representa o cliente a ser cadastrado
     * @return código do cliente cadastrado
     * @throws Exception
     */
    public Integer cadastrar(Cliente cliente) throws Exception;

    /**
     * Atualiza um cliente
     *
     * @param cliente
     * objeto {@link Cliente} que representa o cliente a ser atualizado
     * @return número de linhas afetadas
     */
    public Integer atualizar(Cliente cliente) throws Exception;

    /**
     * Busca um cliente pelo código
     *
     * @param codigo
     * código do cliente a ser buscado
     * @return objeto {@link Cliente} que representa o cliente encontrado
     * @throws Exception
     */
    public Cliente buscar(String codigo) throws Exception;

    /**
     * Busca todos os clientes
     *
     * @return lista de objetos {@link Cliente} que representam todos os clientes
     * @throws Exception
     */
    public List<Cliente> buscarTodos() throws Exception;

    /**
     * Exclui um cliente
     *
     * @param cliente
     * objeto {@link Cliente} que representa o cliente a ser excluído
     * @return número de linhas afetadas
     * @throws Exception
     */
    public Integer excluir(Cliente cliente) throws Exception;

}