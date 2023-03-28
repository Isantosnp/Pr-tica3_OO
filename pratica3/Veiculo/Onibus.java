package pratica3.Veiculo;

import javax.swing.JOptionPane;

public class Onibus extends Veiculo{
    private int assentos;

    public Onibus(int ano, String placa, int assentos) {
        super(ano, placa);
        this.assentos = assentos;
    }

    public int getAssentos() {
        return assentos;
    }

    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }
    public void exibirDados() {
        JOptionPane.showMessageDialog(null, "Dados do veículo:\n\nPlaca: " +getPlaca() + "\nAno: " + getAno(), "Onibus", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Número de assentos: " + getAssentos(), "Onibus", JOptionPane.INFORMATION_MESSAGE);
    }
}
