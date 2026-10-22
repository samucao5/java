import java.util.Arrays;
public class manipulacao_avancada_de_arrays {
    //copia de Arrays com Arrays.copyOf()
    //Cria uma nova copia de um array com tamanho especificado
    //Pode ser utilizado para truncar ou expandir arrays;

    //Preenchimentos de Arrays com Arrays.fill()
    //preenche todos os elementos do array com um valor especifico
    //Util para inicialização de arrays com valores padrão

    //Transormação de Arrays com Arrays.stream()
    //Converte um array em um Stream para manipulação funciona
    //permite filtragemm, mapeamento, redução e outras operações

    public static void main(String[] args)
    {
        int[] numeros = {2,32,3,242,151,232};
        //copia
        int[] copia_numeros = Arrays.copyOf(numeros, 2);

        System.out.println(Arrays.toString(numeros));
        System.out.println(Arrays.toString(copia_numeros));

        //fill - preenchimento
        String[] nomes = new String[5];

        System.out.println(Arrays.toString(nomes));

        Arrays.fill(nomes, "samuel");

        System.out.println(Arrays.toString(nomes));

        //transformação de array para stream
        int[] values = {1,23,242,4525};

        // fazer uma soma dos elementos

        int soma = Arrays.stream(values).sum();

        System.out.println(soma);
    }
}
