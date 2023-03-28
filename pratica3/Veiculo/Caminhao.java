package pratica3.Veiculo;

import javax.swing.JOptionPane;

public class Caminhao extends Veiculo{
    private int eixos;

    public Caminhao(int ano, String placa, int eixos) {
        super(ano, placa);
        this.eixos = eixos;
    }

    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }
    public void exibirDados(){
        JOptionPane.showMessageDialog(null, "Dados do veículo:\n\nPlaca: " +getPlaca() + "\nAno: " + getAno(), "Caminhão", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Número de eixos: " + getEixos(), "Caminhão", JOptionPane.INFORMATION_MESSAGE);
    }
}
