import java.util.*;

public class exercicio_5 {
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        int valor;
        String situacao;
        System.out.println("digite um numero:  ");
        valor = scanner.nextInt();

        if((valor >= 10) && (valor <= 20))
        {
            situacao = "Dentro do intervalo";
        }
        else
        {
            situacao = "Fora do intervalo";
        }
        System.out.println(situacao);
    }
}
