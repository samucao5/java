package estrutura_de_controle;
import java.util.Scanner;

public class While_2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String valor = "";

        while(!valor.equalsIgnoreCase("Sair"))
            {
                System.out.print("Voce diz: ");
                valor = entrada.nextLine();
            }

            entrada.close();
    }
}
