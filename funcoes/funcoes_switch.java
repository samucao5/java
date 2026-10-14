package funcoes;
import java.util.Scanner;

public class funcoes_switch {
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite entre os funcionario: fernando, junior e samuel");
        String nome = scanner.nextLine();

        String retorno = tabela_de_funcionario(nome);
        System.out.println(retorno);
    }

    public static String tabela_de_funcionario(String n)
    {
        String mensagem = "";
        switch(n)
        {
            case "fernando":
                mensagem = "Funcionario fernando encontrado";
                break;

            case "junior":
                mensagem = "Funcionario junior encontrado";
                break;

            case "samuel":
                mensagem = "Funcionario samuel encontrado";
                break;
            
            default:
                mensagem = "Funcionario não encontrado";
                break;
        }
        return mensagem;
    };
}
