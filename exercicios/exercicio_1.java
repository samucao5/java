package exercicios;
import java.util.*;

public class exercicio_1 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int preco;
        System.out.println("Insira o preço do produto: ");
        preco = scanner.nextInt();

        if(preco < 50){
            System.out.println("Produto barato");
        }
        else if((preco >= 50) && (preco <= 100))
        {
            System.out.println("Produto com preco medio");
        }
        else
        {
            System.out.println("Produto com preco alto");
        }

    }
}
