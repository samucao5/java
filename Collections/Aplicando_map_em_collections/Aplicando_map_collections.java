package Collections;
import java.util.*;
import java.util.stream.*;

public class Aplicando_map_collections {
    
    public static void main(String[] args) {
        List <Integer> numero = new ArrayList<>();
        numero.add(13);
        numero.add(25);
        numero.add(31);
        numero.add(47);
        numero.add(50);

        //modificam a collection
        List<Integer> quadrados = numero.stream()
                                        .map(n -> n * n)
                                        .collect(Collectors.toList());

        System.out.println(numero);
        System.out.println(quadrados);

        
        List<String> nomes = new ArrayList<>();
        nomes.add("samuel");
        nomes.add("allan");
        nomes.add("joao");

        List<String> nomesMaiusculos = nomes.stream()
                                            .map(String::toUpperCase)
                                            .collect(Collectors.toList());

        System.out.println(nomes);
        System.out.println(nomesMaiusculos);
    }
}
