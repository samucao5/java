package Desafios;
import java.util.Scanner;

public class Desafio_While
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0, total = 0, codigo = 0;

        while(codigo != -1)
            {
                System.out.print("Digite uma nota entre 0 a 10: ");
                int nota = scanner.nextInt();

                if(nota < 0 || nota > 10)
                    {
                        System.out.println("nota invalida");
                    }
                else
                    {
                        total += nota;
                        contador++;
                    }

                System.out.println("caso queira sair so digitar -1: ");
                codigo = scanner.nextInt();

            }

            int media = total / contador;

            System.out.println("Notas validas: " + contador + "\nMedia das notas: " + media);
    }
}