package pratica3.Veiculo;

import javax.swing.JOptionPane;

public class Veiculo {
    private int ano = 0;
    private String placa = "";

    public Veiculo(int ano, String placa) {
        this.ano = ano;
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public void exibirDados(String placa, int ano){
        JOptionPane.showMessageDialog(null, "Dados do veículo:\n\nPlaca: " +getPlaca() + "\nAno: " + getAno());

    }
}
