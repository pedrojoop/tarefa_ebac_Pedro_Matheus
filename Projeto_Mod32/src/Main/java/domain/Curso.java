package Main.java.domain;

import javax.persistence.*;

/**
 * @author pmpedrolima@gmail.com
 */
@Entity
@Table(name="TB_CLIENTE")
public class Curso {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE,generator="cliente_seq")
    @SequenceGenerator(name="cliente_seq", sequenceName="sq_cliente", allocationSize=1, initialValue=1)
    private Long id;

    @Column(name="NOME", length = 50, nullable = false)
    private String nome;

    @Column(name="CODIGO", length = 10, nullable = false, unique = true)
    private String codigo;

    @Column(name="DESCRICAO", length = 100, nullable = false)
    private String descricao;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
