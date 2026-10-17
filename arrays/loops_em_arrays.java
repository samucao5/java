package arrays;

public class loops_em_arrays {
    public static void main(String[] args) {
        
        int[] numeros = {1,3,4,24,5};
        int soma = 0;
        // for
        for(int i = 0; i < numeros.length; i++)
            {
                soma += numeros[i];
            }

        System.out.println("soma dos valores do array: " + soma);

        String[] nomes = {"samuel", "fernandp", "Isa", "maria", "Yasmin"};
        
        //for each
        //nomear o item => array
        //nomes => nome
        
        for(String nome : nomes)
            {
                System.out.println("o nome do funcionario e: " + nome);
            }

        //while

        int maior_valor = 0;
        int i = 0;
        
        while(i < numeros.length)
            {
                if(numeros[i] > maior_valor)
                    {
                        maior_valor = numeros[i];
                    }
                
                i++;
            }

        System.out.println("o maior valor e: " + maior_valor);
    }
}
