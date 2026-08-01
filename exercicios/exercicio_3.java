
import java.util.*;

public class exercicio_3 {
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        int numero, resultado;
        String resultado_s;
        System.out.println("Digite um numero: ");
        numero = scanner.nextInt();
        resultado = numero % 2;

        if(resultado == 0)
        {
            resultado_s = "par";
            
        }
        else
        {
            resultado_s = "impar";
        }

        System.out.println("o valor e " + resultado_s);
        scanner.close();
    }

}
