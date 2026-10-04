package Execicio_1;

import javax.swing.JOptionPane;

public class CestaDeFrutas {
    public static void main(String [] args){
        int macas = Integer.parseInt(JOptionPane.showInputDialog("Quantas maçãs?"));
        int mamoes = Integer.parseInt(JOptionPane.showInputDialog("Quantos mamões?"));
        double valor = (macas * 1) + (mamoes * 3.5);
        JOptionPane.showMessageDialog(null, "Seu valor final é de " + valor);

    }
}
