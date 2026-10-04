package Execicio_1;
import javax.swing.JOptionPane;
public class Desconto {
    public static void main(String [] args){
        String CompraStr = JOptionPane.showInputDialog("Digite o valor da compra");
        double Compra = Double.parseDouble(CompraStr);
        String DescontoStr = JOptionPane.showInputDialog("Digite o valor do desconto");
        double Desconto = Double.parseDouble(DescontoStr);
        double valor = Compra - (Compra*Desconto/100);
        JOptionPane.showMessageDialog(null, "Você deve pagar: " + valor );
    }
}
