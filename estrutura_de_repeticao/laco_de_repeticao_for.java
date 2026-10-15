package estrutura_de_repeticao;
import java.util.Scanner;

public class laco_de_repeticao_for {

    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero para contar: ");
        int valor = scanner.nextInt();
        contador(valor);

    }
    
    public static void contador(int n)
    {
        for(int i = 1; i <= n; i++)
            {
                System.out.println("valor atual: " + i);

            }
    }
}
