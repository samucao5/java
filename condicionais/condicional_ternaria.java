package condicionais;
import java.util.*;

public class condicional_ternaria
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        
        int numero;
        System.out.println("digite um valor: ");
        numero = scanner.nextInt();

        String resultado = (numero % 2 == 0) ? "par" : "Impar";
        System.out.println(resultado);



    }



}
