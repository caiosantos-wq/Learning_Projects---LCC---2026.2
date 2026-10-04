package Execicio_1;
import javax.swing.JOptionPane;

public class media {
    public static void main(String [] args){
        String nota1Str = JOptionPane.showInputDialog("Digite a primeira nota");
        String nota2Str = JOptionPane.showInputDialog("Digite a segunda nota");
        double nota1 = Double.parseDouble(nota1Str);
        double nota2 = Double.parseDouble(nota2Str);
        double media = (nota1 + nota2)/2;
        System.out.println("Sua média é de "+media);
    }
}
