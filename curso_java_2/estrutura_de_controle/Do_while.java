package estrutura_de_controle;
import java.util.Scanner;

public class Do_while {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String texto;

        do
        {
            System.out.println("Voce precisa falar" + "\nas palavras magicas....");
            System.out.println("quer sair? ");
            texto = entrada.nextLine();
        }while(!texto.equalsIgnoreCase("Por favor"));

        System.out.println("Obrigado");
        entrada.close();
    }
}
