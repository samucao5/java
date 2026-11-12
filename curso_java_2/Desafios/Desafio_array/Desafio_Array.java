package Desafios.Desafio_array;
import java.util.Scanner;
public class Desafio_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite quantas a quantidade de notas: ");
        int q_notas = scanner.nextInt();
        double soma = 0;
        double[] notas = new double[q_notas];

        for(int i = 0; i < notas.length; i++)
            {
                System.out.println("digite a nota " + i + ": ");
                notas[i] = scanner.nextDouble();
            }
        
        for (double nota : notas) 
        {
            System.out.println(nota);
            soma += nota;
        }

        System.out.println("media da notas: " + soma / notas.length);
        scanner.close();
    }
}
