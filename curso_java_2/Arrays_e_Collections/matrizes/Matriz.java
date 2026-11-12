package Arrays_e_collections;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantidade de alunos: ");
        int Quantidade_alunos = sc.nextInt();

        System.out.println("Quantidade de notas: ");
        int Quantidade_notas = sc.nextInt();
        int total = 0;
        double[][] notasTurmas = new double[Quantidade_alunos][Quantidade_notas];

        for(int i = 0; i < notasTurmas.length; i++)
            {
                for (int j = 0; j < notasTurmas[i].length; j++)
                    {
                        System.out.printf("Informe a nota do %d do aluno %d: ", j + 1, i + 1);
                        notasTurmas[i][j] = sc.nextDouble();
                        total += notasTurmas[i][j];
                    }
            }
        
        double media = total / (Quantidade_alunos * Quantidade_notas);
        System.out.println("Media da turma e: " + media);

        sc.close();

    }
}
