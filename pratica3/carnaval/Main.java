package pratica3.carnaval;

import java.util.Scanner;

public class Main {           //Obs: no main não é necessário puxar o extends

    public static void main(String[] args) {
        double valor, valorVip, valorCamarote, adicionalVip, adicionalCamarote, adicionalLocalizacaoCamarote;
        int opcao;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe a opção ingresso que você deseja: \n 1 (Ingresso Normal) \n 2 (Ingresso VIP) \n 3 (Ingresso Camarote) ");
        opcao = teclado.nextInt();
        switch (opcao){         // criei a variável opcao como auxiliar para o usuário conseguir selecionar qual ingresso deseja

//Instanciei o objeto em cada case pois assim consigo relacionar as variáveis auxiliares com a variável da classe
            case 1:
                System.out.println("Informe o valor do ingresso Normal: ");
                valor = teclado.nextDouble();
                Normal ingressoNormal = new Normal(valor);
                ingressoNormal.ImprimeValor();
                break;
            case 2:
                System.out.println("Informe o valor do ingresso VIP: ");
                valorVip = teclado.nextDouble();
                System.out.println("Informe o valor Adicional do Vip");
                adicionalVip = teclado.nextDouble();
                Vip ingressoVip = new Vip(valorVip,adicionalVip);
                ingressoVip.ImprimeVip();
                break;
            case 3:
                System.out.println("Informe o valor do ingresso Camarote: ");
                valorCamarote = teclado.nextDouble();
                System.out.println("Informe o valor de localização do Camarote: ");
                adicionalLocalizacaoCamarote = teclado.nextDouble();
                System.out.println("Informe o valor Adicional de Camarote: ");
                adicionalCamarote = teclado.nextDouble();
                Camarote ingressoCamarote = new Camarote(valorCamarote, adicionalLocalizacaoCamarote, adicionalCamarote);
                ingressoCamarote.ImprimeCamarote();
                break;
            default:
                System.out.println("Opção Errada");
                teclado.close();
        }
    }
}
