package Desafios.DesafioClasseData;
import java.util.Scanner;

public class Desafio_main {
    public static void main(String[] args) {
        var data_1 = new Classe_Data();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um dia: ");
        data_1.dia = scanner.nextInt();
        System.out.println("Digite um mes: ");
        data_1.mes = scanner.nextInt();
        System.out.println("Digite um ano: ");
        data_1.ano = scanner.nextInt();

        System.out.println(data_1.obterDataFormata());
        
        Classe_Data data_2 = new Classe_Data(3,11,2005);
        System.out.println(data_2.obterDataFormata());

        Classe_Data data_3 = new Classe_Data();
        System.out.println(data_3.obterDataFormata());
    }
}
