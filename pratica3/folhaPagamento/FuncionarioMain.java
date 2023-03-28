package pratica3.folhaPagamento;

import java.util.Scanner;

public class FuncionarioMain {
    public static void main(String[] args) {
        int matricula;
        double salario;
        String nome,opcao;
        FComissionado fComissionado;
        FFPadrao ffPadrao;
        FFProdutividade ffProdutividade;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe a sua matricula: ");
        matricula = teclado.nextInt();
        System.out.println("Informe o seu nome completo: ");
        nome = teclado.nextLine();
        teclado.nextLine();
        System.out.println("Informe o seu salário : ");
        salario = teclado.nextDouble();
        System.out.println("Impostos:");
        double impostos = teclado.nextDouble();

        System.out.println("Informe a opção de modelo de trabalho :");
        opcao = teclado.nextLine();
    teclado.nextLine();

        if (opcao.equalsIgnoreCase("Comissão")){
            System.out.println("Venda: ");
            double valorvenda = teclado.nextDouble();
            System.out.println("Porcentagem: ");
            double porcentagem = teclado.nextDouble();

            fComissionado = new FComissionado(matricula,nome, salario,porcentagem, valorvenda);
            fComissionado.setVendas(valorvenda);
            fComissionado.setPercentual(porcentagem);
            fComissionado.calcularProventosComissionado();
            fComissionado.toString();

        }else
        if (opcao.equals("Produtividade")){
            System.out.println("Produtividade: ");
            double produtividade = teclado.nextDouble();
            System.out.println("Produção: ");
            int producaoHora = teclado.nextInt();

            ffProdutividade = new FFProdutividade(matricula, nome,salario, produtividade, producaoHora);
            ffProdutividade.setProducaohora(producaoHora);
            ffProdutividade.setValorProdutividade(produtividade);
            ffProdutividade.calcularProventosProdutividade();
            ffProdutividade.toString();

        } else
            if (opcao.equalsIgnoreCase("Padrão")){
            ffPadrao = new FFPadrao(matricula, nome, salario);
            ffPadrao.calcularProventos(impostos);
            ffPadrao.toString();
        }
        teclado.close();
    }
}
