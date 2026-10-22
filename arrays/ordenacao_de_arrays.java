import java.util.Arrays;
import java.util.Comparator;


public class ordenacao_de_arrays {
    public static void main(String[] args)
    {
        //1 - Oedenação

        //Ordenacao de Array de inteiros
        int[] numeros = {2,34,12,4,52,133,28};

        // Modifica o array original
        Arrays.sort(numeros);

        System.out.println(Arrays.toString(numeros));

        //Ordenacao com comparator
        String[] nomes = {"Samuel", "Allan", "Joao", "Yasmin"};

        Arrays.sort(nomes);

        Arrays.sort(nomes, Comparator.reverseOrder());

        System.out.println(Arrays.toString(nomes));

        // Ordencao de matriz
        int[][] matriz = 
        {
            {4,3,2},
            {8,543,3},
            {12,34,5}
        };
        //ordenação de linha, por um valor de coluna
        Arrays.sort(matriz, Comparator.comparingInt(a -> a[1]));

        for(int[] linha : matriz)
        {
        System.out.println(Arrays.toString(linha));

        }

        System.out.println(Arrays.deepToString(matriz));
    }
}
