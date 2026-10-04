package Execicio_1;
 import javax.swing.JOptionPane;

public class IMC1 {
    public static void main(String[] args) {
        String pesoString = JOptionPane.showInputDialog("Digite seu peso: ");
        double peso = Double.parseDouble(pesoString);
        String alturaString = JOptionPane.showInputDialog("Digite a sua altura: ");
        double altura = Double.parseDouble(alturaString);
        double imc = peso / (altura * altura);
        JOptionPane.showMessageDialog(null, "Seu IMC é de " + imc);
    }
}
