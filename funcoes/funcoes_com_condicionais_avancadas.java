package funcoes;
import java.util.Scanner;

public class funcoes_com_condicionais_avancadas {
    
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("digite o codigo: ");
        int id = scanner.nextInt();

        String retorno = entrada(nome, id);
        System.out.println(retorno);
    }

    public static String entrada(String n, int i)
    {
        String nome_v = "Samuel";
        int id_v = 32423;

        if(n.equalsIgnoreCase(nome_v) && i == id_v)
            {
                return "acesso permitido";
            }
        else
            {
                return "acesso negado";
            }
    };

}
