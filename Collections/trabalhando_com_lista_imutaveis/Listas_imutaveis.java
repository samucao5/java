package Collections;
import java.util.*;


public class Listas_imutaveis {
    
    public static void main(String[] args) {
        //collections imutaveis
        //criando lista imutaveis 

        List<String> listaMutavel = new ArrayList<>();

        listaMutavel.add("Samuel");
        listaMutavel.add("Joao");
        
        List<String> listaImutavel = Collections.unmodifiableList(listaMutavel);

        System.out.println(listaImutavel);


        //listaIMutavel.add("Allan");

        System.out.println(listaImutavel);

        List<String> listaImutavel2 = List.of("item 1", "item 2", "item 3");

        //listaImutavel2.add("item 4");

        System.out.println(listaImutavel2);

        Set <Integer> listaImutavelSet = Set.of(1,2,3);

        //listaImutavelSet.add("5");

        System.out.println(listaImutavelSet);

        Map <String, Integer> listaImutavelMap = Map.of("Samuel", 21, "Joao", 18);

        //listaImutavelMap.put("Allan", 19);

        System.out.println(listaImutavelMap);

    }
}
