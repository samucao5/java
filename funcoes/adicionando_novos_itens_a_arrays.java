import java.util.ArrayList;
import java.util.Arrays;

public class adicionando_novos_itens_a_arrays {
    //Arrays em java tem tamanhos fixo, portanto, para adicionar novos itens, e necessario crair um novo array ou usar estruturas como ArrayList
    //Metodos comuns: Criar um novo array maior e copiar os elementos, usar ArrayList para manipulação dinamica de elementos;
    public static void main(String[] args)
    {
    int[] numeros = {12,32,423,32,42};
    int[] novoArray = new int[numeros.length + 1];

    for(int i = 0; i < numeros.length; i++)
        {
            novoArray[i] = numeros[i];
        }
        
        System.out.println(Arrays.toString(novoArray));
        
        //ex2: utilizando arraycopy para copiar os elementos
        String[] nomes = {"samuel", "joao", "pedro", "allan"};
        String[] novoNome = new String[nomes.length + 1];

        System.arraycopy(nomes, 0, novoNome, 0, nomes.length);

        novoNome[novoNome.length - 1] = "yasmin";

        System.out.println(Arrays.toString(novoNome));

        //ex3: usando ArrayList
        ArrayList<String> listaNome = new ArrayList<>(Arrays.asList("samuel", "joao", "pedro", "allan", "yasmin"));

        System.out.println(listaNome);

        listaNome.add("fernando");

        System.out.println(listaNome);

    }
}
