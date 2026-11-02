package Collections;

import java.util.*;

public class colecoes {
    
    public static void main(String[] args)
    {
        // List

        List<String> listaDeNomes = new ArrayList<>();
        
        //Adicionar
        listaDeNomes.add("Samuel");
        listaDeNomes.add("Joao");
        listaDeNomes.add("Allan");

        //Resgatar
        System.out.println("Primeiro nome: " + listaDeNomes.get(0));

        // Alterar
        listaDeNomes.set(2, "Yasmin");

        System.out.println("Terceiro nome: " + listaDeNomes.get(2));

        //Remover
        listaDeNomes.remove(2);

        //Erro de execução, fora dos indices do Array, pois o indice foi apagado
        //System.out.println("Terceiro nome: " + listaDeNomes.get(2));

        listaDeNomes.add("teste");
        listaDeNomes.add("outro_teste");

        //procura de item por valor de item
        //retorna um boolean
        System.out.println(listaDeNomes.contains("teste"));

    }
}
