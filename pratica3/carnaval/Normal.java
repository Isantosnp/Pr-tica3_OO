package pratica3.carnaval;

public class Normal extends Ingresso{ // usei o extends para puxar a superclasse Ingresso
    public Normal(double valor) {
        super(valor);
    }
    public void ImprimeValor(){                                                //metodo para imprimir o valor de ingresso NORMAL
        System.out.println("O valor do Ingresso Normal : " +getValor());                 //Usei o Get valor para mostrar o valor do ingresso normal
}
}
