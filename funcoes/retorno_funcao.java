package funcoes;
import java.util.Scanner;

public class retorno_funcao
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite um numero: ");
        int numero = scanner.nextInt();
        int i = dobrar(numero);
        System.out.println("numero dobrado: " + i);
        System.out.println(verificar_par(numero));

        System.out.println(verificar_par(dobrar(numero)));

    }

    public static int dobrar(int n)
    {
        return n * 2;
    }

    public static String verificar_par(int v)
    {
        if(v % 2 == 0)
            {
                return "o valor de " + v + " e par";
            }
        else
            {
                return "o valor de " + v + " e impar";
            }
    }
}