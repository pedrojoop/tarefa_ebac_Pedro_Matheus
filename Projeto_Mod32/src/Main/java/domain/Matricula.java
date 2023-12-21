package Main.java.domain;

import javax.persistence.*;
import java.time.Instant;

/**
 * @author pmpedrolima@gmail.com
 */
@Entity
@Table(name="TB_MATRICULA")
public class Matricula {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE,generator="matri_seq")
    @SequenceGenerator(name="matri_seq", sequenceName="sq_matricula", allocationSize=1, initialValue=1)
    private Long id;

    @Column(name="CODIGO", length = 10, nullable = false, unique = true)
    private String codigo;

    @Column(name="DATA_MATRICULA")
    private Instant dataMatricula;

    @Column(name="VALOR")
    private double valor;

    @Column(name="STATUS")
    private String status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Instant getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(Instant dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
