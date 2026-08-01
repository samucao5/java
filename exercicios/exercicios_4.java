import java.util.*;

public class exercicios_4 {
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        int numero;
        String dia_da_semana;

        System.out.println("digite um numero do dia da semana 1 - 7: ");
        numero = scanner.nextInt();

        switch(numero){
            case 1:
                dia_da_semana = "Segunda-feira";
                break;

            case 2:
                dia_da_semana = "Terça-feira";
                break;

            case 3:
                dia_da_semana = "Quarta-feira";
                break;

            case 4:
                dia_da_semana = "Quinta-feira";
                break;

            case 5:
                dia_da_semana = "Sexta-feira";
                break;

            case 6:
                dia_da_semana = "Sabado";
                break;

            case 7:
                dia_da_semana = "Domingo";
                break;

            default:
                dia_da_semana = "dia não encontrado";
                break;
        }  
        
        System.out.println(dia_da_semana);

    }
}
