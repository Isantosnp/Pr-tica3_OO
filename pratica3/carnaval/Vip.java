package pratica3.carnaval;

public class Vip extends Ingresso{  // usei o extends para puxar a superclasse Ingresso
    private double valorAdicional;           // variável usada apenas no VIP pois somente ele tem o valor adicional como particularidade
    public Vip(double valor, double valorAdicional) {                //criei um constructor para puxar os atributos da superclasse(Ingresso)
                                                                    // e para relacionar as variáveis no criado objeto instanciado programa excecutável
        super(valor);
        this.valorAdicional = valorAdicional;
    }
    public void ImprimeVip() {
        double valorTotal = getValor() + this.valorAdicional;                  // imprimir o valor do ingresso calculando  com a variável local "valorAdicional"
        System.out.println("O valor do Ingresso VIP é: " +valorTotal);
    }

}
