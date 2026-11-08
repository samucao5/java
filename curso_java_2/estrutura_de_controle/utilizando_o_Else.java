package estrutura_de_controle;
import javax.swing.JOptionPane;

public class utilizando_o_Else {
    public static void main(String[] args) {
        String valor = JOptionPane.showInputDialog("informe um numero: ");
        int numero = Integer.parseInt(valor);

        if(numero % 2 == 0)
            {
                System.out.println("Numero par");
            }
        else
            {
                System.out.println("Numero impar");
            }
    }
}
