package pratica3.carnaval;

public class Camarote extends Ingresso{  // usei o extends para puxar a superclasse Ingresso
    private double valorLocalizacao;             //particularidade da classe
    private double valorAdicional;               //particularidade da classe

    public Camarote(double valor, double valorLocalizacao, double valorAdicional) {
        super(valor);
        this.valorLocalizacao = valorLocalizacao;
        this.valorAdicional = valorAdicional;
    }

    public void ImprimeCamarote() {
        double valortotal = getValor() + this.valorAdicional+ this.valorLocalizacao;
        System.out.println(" Valor Camarote: " +valortotal);
    }
}

