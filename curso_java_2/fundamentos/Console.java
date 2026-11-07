package fundamentos;
import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        System.out.println("bom");
        System.out.println("dia!\n\n");

        System.out.println("bom");
        System.out.println("dia!");

        System.out.printf("megasena: %d %d %d %d %d %d %n", 1,2,3,4,5,6, 7);

        System.out.printf("\nSalario: %.1f%n ", 1234.23);

        System.out.printf("\nNome: %s%n", "João");

        Scanner entrada = new Scanner(System.in);

        System.out.println("digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.println("digite seu sobrenome: ");
        String sobrenome = entrada.nextLine();

        System.out.println("digite seu idade: ");
        int idade = entrada.nextInt();

        System.out.println("Nome: " + nome + "\nsobrenome: " + sobrenome + "\nidade: " + idade + " anos");

        entrada.close();
    }
}
