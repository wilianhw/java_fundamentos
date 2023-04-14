package aula52.javadoc.modelo;

/**
 *  Representa um funcionário da empresa.
 *
 * @author Wilian
 *
 */
public class Funcionario {
    private String nome;
    private Double salario;

    /**
     * Não utilize mais, porque o salário é obrigatório.
     *
     * @deprecated
     *
     * @param nome
     */
    public Funcionario(String nome) {
        this.nome = nome;
    }

    public Funcionario(String nome, Double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    /**
     * Calcula o valor do adiantamento que deverá ser pago ao funcionário.
     *
     * <p>O valor da diária e calculado dividindo-se o <b>salario por 30 (dias do mês).</b></p>
     *
     * <p>Mas se o destino for uma capital é adicionado 20% ao adiantamento.
     *
     * @param   dias
     *          Indica a quantidade de dias da viagem.
     * @param   capital
     *          Indica se é uma capital brasileira.
     * @return  Valor em reais do adiantamento.
     *
     * @throws  IllegalArgumentException
     *          Caso {@code dias} for menor ou igual a zero.
     *
     * @since   1.1.0
     *
     * @see Viagem
     *
     */
    public double adiantamentoViagem(int dias, boolean capital) {
        if (dias <= 0)
            throw new IllegalArgumentException("Dias devem ser maior que zero");

        double valorDiaria = this.salario / 30;

        double valorAdiantamento = valorDiaria * dias;

        if (capital)
            valorAdiantamento*= 1.2;

        return valorAdiantamento;
    }
}
