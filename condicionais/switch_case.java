package  condicionais;
import java.util.*;

public class switch_case{
    public static void main(String [] args)
    {
        int opcao;
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite entre 1 e 2");
        opcao = scanner.nextInt();

        switch(opcao)
        {
        //caso o numero seja o 1
            case 1:
                //ele roda este codigo
                System.out.println("valor numero 1");
                //break não permite que o codigo avance 
                break;
        //caso o numero seja o 2
            case 2:
                //ele roda este codigo
                System.out.println("valor numero 2");
                //break não permite que o codigo avance
                break;
        //caso nenhuma das opções seja verdadeira o codigo vem para o default        
            default:
                //ele roda este codigo
                System.out.println("valor numero " + opcao);
                break;
        } 
    }
}