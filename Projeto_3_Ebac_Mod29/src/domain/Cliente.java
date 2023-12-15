package domain;

/**
 * @author pmpedrolima@gmail.com
 */
public class Cliente {
    private Long id;
    private String nome;
    private String codigo;

    /**
     * retorna o id do cliente
     *
     * @return o id do cliente
     */
    public Long getId() {
        return id;
    }

    /**
     * armazena o id do cliente
     *
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * retorna o nome do cliente
     *
     * @return nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * armazena o nome do cliente
     *
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * retorna o codigo do cliente
     *
     * @return codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * armazena o codigo do cliente
     *
     * @param codigo
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
