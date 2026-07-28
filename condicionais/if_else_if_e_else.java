package condicionais;
import java.util.*;

public class if_else_if_e_else {
    public static void main(String [] args){
        int numero = 5, numero_2;
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite um numero: ");
        numero_2 = scanner.nextInt();

        if(numero_2 > numero)
        {
            System.out.println(numero_2 + " > " + numero);
        }
        else if(numero_2 == numero)
        {
            System.out.println(numero_2 + " == " + numero);
        }
        else
        {
            System.out.println(numero_2 + " < " + numero);
        }
        //evita o problema de cortar a proxima entrada de dados
        scanner.nextLine();
        //caso queira fazer uma identificador de senha
        String senha = "samuel", nome;
        boolean resultado;
        System.out.println("Digite o nome do criador do codigo: ");
        nome = scanner.nextLine();
        resultado = (senha.equalsIgnoreCase(nome));
        
        if(resultado == true)
        {
            System.out.println("senha correta");
        }
        else
        {
            System.out.println("Senha incorreta");
        }
    }
}
