package br.com.pedro.domain;

import java.util.Objects;

/*
* @author pmpedrolima@gmail.com
 */
public class Cliente {
    private String name;
    private long cpf;
    private long tel;
    private String end;
    private Integer numero;
    private String cidade;
    private String estado;

    public Cliente(String name, long cpf, long tel, String end, String cidade, String estado) {
        // Validar campos obrigatórios
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser nulo ou vazio");
        }
        if (cpf <= 0) {
            throw new IllegalArgumentException("CPF deve ser um valor positivo");
        }
        // Adicionar validações semelhantes para os outros campos, se necessário...

        this.name = name;
        this.cpf = cpf;
        this.tel = tel;
        this.end = end != null ? end : "";
        this.cidade = cidade != null ? cidade : "";
        this.estado = estado != null ? estado : "";
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public long getTel() {
        return tel;
    }

    public void setTel(long tel) {
        this.tel = tel;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "name='" + name + '\'' +
                ", cpf=" + cpf +
                ", tel=" + tel +
                ", end='" + end + '\'' +
                ", numero=" + numero +
                ", cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return cpf == cliente.cpf;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf);
    }
}