package pratica3.folhaPagamento;

public class FFProdutividade extends Funcionario {
    private double valorProdutividade;
    private int producaohora;

    public FFProdutividade(int matricula, String nome, double salario, double valorProdutividade, int producaohora) {
        super(matricula, nome, salario);
        this.valorProdutividade = valorProdutividade;
        this.producaohora = producaohora;
    }

    public double getValorProdutividade() {
        return valorProdutividade;
    }

    public void setValorProdutividade(double valorProdutividade) {
        this.valorProdutividade = valorProdutividade;
    }

    public int getProducaohora() {
        return producaohora;
    }

    public void setProducaohora(int producaohora) {
        this.producaohora = producaohora;
    }

    public double calcularProventosProdutividade() {
        double valorTotal = this.valorProdutividade * producaohora;
        return getSalario() + valorTotal;
    }

    public String toString() {
        return "Funcionario: " + getNome() + "\nMatricula: " + getMatricula();
    }
}
