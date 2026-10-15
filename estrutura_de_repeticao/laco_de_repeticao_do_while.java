package estrutura_de_repeticao;
import java.util.Scanner;

public class laco_de_repeticao_do_while {
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite um valor: ");

        int numero = scanner.nextInt();
        int valor = 0;
        
        do
        {
            valor = (int)(Math.random() * 10);
            
            if(valor > numero)
            {
                System.out.println(valor + " maior que " + numero);
                break;
            }
            else
            {
                System.out.println(valor + " menor que " + numero);
            }
        }
        while(valor <= numero);

    } 
}
