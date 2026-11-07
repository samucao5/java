package Desafios;
import java.util.Scanner;

public class Conversao {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String valor_1, valor_2, valor_3;

        System.out.println("digite o primeiro salario: ");
        valor_1 = scanner.nextLine().replace(",", ".");

        System.out.println("digite o segundo salario: ");
        valor_2 = scanner.nextLine().replace(",", ".");

        System.out.println("digite o terceiro salario: ");
        valor_3 = scanner.nextLine().replace(",", ".");

        double numero_1 = Double.parseDouble(valor_1);
        double numero_2 = Double.parseDouble(valor_2);
        double numero_3 = Double.parseDouble(valor_3);

        double media = ((numero_1 + numero_2 + numero_3) / 3);

        System.out.printf("a media do salario e: R$%.2f%n", media);
        
        scanner.close();
    }
}
