package pratica3.Veiculo;

import javax.swing.JOptionPane;

public class VeiculoMain {
    public static void main(String[] args) {
        Onibus onibus;
        Caminhao caminhao;

        String opcao = JOptionPane.showInputDialog(null, "Veiculo :", "Veiculo", JOptionPane.QUESTION_MESSAGE);
        if(opcao.equalsIgnoreCase("Caminhao")){
            String placa = JOptionPane.showInputDialog(null,"Placa do veiculo", "Caminhão", JOptionPane.QUESTION_MESSAGE);
            int ano = Integer.parseInt(JOptionPane.showInputDialog(null, "Ano do veiculo: ","Caminhão", JOptionPane.QUESTION_MESSAGE));
            int eixos = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade de eixos no veiculo: ", "Caminhão",JOptionPane.QUESTION_MESSAGE));
            caminhao = new Caminhao(ano, placa, eixos);
            caminhao.exibirDados();
        } else if (opcao.equalsIgnoreCase("Onibus")) {
            String placa = JOptionPane.showInputDialog(null,"Placa do veiculo", "Onibus", JOptionPane.QUESTION_MESSAGE);
            int ano = Integer.parseInt(JOptionPane.showInputDialog(null, "Ano do veiculo: ","Onibus", JOptionPane.QUESTION_MESSAGE));
            int assentos = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade de assentos no veiculo: ", "Onibus",JOptionPane.QUESTION_MESSAGE));
            onibus = new Onibus(ano, placa, assentos);
            onibus.exibirDados();

        }
    }

}
