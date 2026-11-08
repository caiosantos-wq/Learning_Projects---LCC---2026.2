package EstudoPoo.celular;

import javax.swing.JOptionPane;

public class VendaTelefone {
    public static void main() {
        boolean keep = true;
        while(keep){
            String opt = JOptionPane.showInputDialog("Digite uma opção:\n" + "1.Cadastrar produto\n" + "2.Ver estoque\n" + "3.Sair");
            switch (opt){
                case "1":
                    JOptionPane.showMessageDialog(null,"Iniciando cadastro");
                    String modelo = JOptionPane.showInputDialog("Nome do modelo: ");
                    String tela = JOptionPane.showInputDialog("Tamanho da tela: ");
                    String armazenamento = JOptionPane.showInputDialog("Tamanho do armazenamento: ");
                    String camera = JOptionPane.showInputDialog("Quantidade de MP: ");
                    Celular celular = new Celular(modelo, tela, armazenamento, camera);
                    JOptionPane.showMessageDialog(null, modelo);
                    System.out.println(modelo);
                    break;

                case "2":
                    JOptionPane.showMessageDialog(null, "Listando produtos...");
                    break;

                case "3":
                        keep = false;
                        break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
            }
        }
        System.out.println("fim");

    }
}
