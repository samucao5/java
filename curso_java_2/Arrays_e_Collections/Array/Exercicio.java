package Arrays_e_collections;
import java.util.Arrays;

public class Exercicio {
    public static void main(String[] args) {
        double[] notasAlunoA = new double[3];
        double total = 0;
        notasAlunoA[0] = 7;
        notasAlunoA[1] = 6;
        notasAlunoA[2] = 6.5;

        System.out.println(Arrays.toString(notasAlunoA));

        for(int i = 0; i < notasAlunoA.length; i++)
            {
                System.out.println(notasAlunoA[i]);
                total += notasAlunoA[i];
            }

        System.out.println("media das notas: " + total / notasAlunoA.length);

        total = 0;
        final double notaArmazenada = 8;
        double[] notasAlunoB = {notaArmazenada, 8.7, 6.4};

        System.out.println(Arrays.toString(notasAlunoB));

        for(int s = 0; s < notasAlunoB.length; s++)
            {
                System.out.println(notasAlunoB[s]);
                total += notasAlunoB[s];
            }

        System.out.println("media das notas: " + total / notasAlunoB.length);

        System.out.println("ultima nota do aluno: " + notasAlunoB[notasAlunoB.length - 1]);
}

}
