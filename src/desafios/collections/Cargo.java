package desafios.collections;

import java.math.BigDecimal;
import java.util.Objects;

public class Cargo {
    private String descricao;
    private BigDecimal salario;

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getSalario() {
        return this.salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cargo cargo = (Cargo) o;
        return descricao.equals(cargo.descricao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(descricao);
    }
}
