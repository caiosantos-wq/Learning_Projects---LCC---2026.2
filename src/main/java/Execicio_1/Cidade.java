package Execicio_1;
import javax.swing.JOptionPane;

public class Cidade {
    public static void main(String[] args){
        String nome = JOptionPane.showInputDialog("Qual seu nome?");
        String cidade = JOptionPane.showInputDialog("qual a sua cidade?");
        System.out.println("Oi" + nome + "! que legal saber que você é da cidade " + cidade);
    }
}
