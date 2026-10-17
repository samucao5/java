
import java.util.Scanner;

public class utilizando_o_foreach {
    public static void main(String [] args)
    {
        boolean teste = false;
        Scanner scanner = new Scanner(System.in);
        String[] nomes = {"allan", "samuel", "joao", "arthur"};
        System.out.println("Digite o nome do funcionario: ");
        String busca = scanner.nextLine();
    
        for (String nome : nomes)
        {
            if(nome.equals(busca)) 
                {
                    System.out.println("funcionario encontrado: " + nome);
                    teste = true;
                }
        }

        if(teste == false)
            {
                System.out.println("este funcionario não foi encontrado");
            }
    }
}
