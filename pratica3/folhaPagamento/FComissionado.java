package pratica3.folhaPagamento;

public class FComissionado  extends Funcionario {
    private double percentual;
    private double vendas;

    public FComissionado(int matricula, String nome, double salario, double percentual, double vendas) {
        super(matricula, nome, salario);
        this.percentual = percentual;
        this.vendas = vendas;
    }

    public double getPercentual() {
        return percentual;
    }

    public void setPercentual(double percentual) {
        this.percentual = percentual;
    }

    public double getVendas() {
        return vendas;
    }

    public void setVendas(double vendas) {
        this.vendas = vendas;
    }

    public double calcularProventosComissionado() {
        double vendacomissao = getVendas() * getPercentual();
        return getSalario() + vendacomissao;
    }

    public String toString() {
        return "Funcionario: " + getNome() + "\nMatricula: " + getMatricula();
    }
}
