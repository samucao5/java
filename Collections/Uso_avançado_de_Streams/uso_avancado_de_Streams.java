package Collections;
import java.util.*;
import java.util.stream.Collectors;

public class uso_avancado_de_Streams {
    public static void main(String[] args) {

        //flatMap = achatar listas
        List<List<String>> listaDeLista = Arrays.asList(
            Arrays.asList("maça", "morango"),
            Arrays.asList("banana", "uva"),
            Arrays.asList("pera", "melancia")
        );

        List<String> listUnica = listaDeLista.stream()
                                            .flatMap(List::stream)
                                            .collect(Collectors.toList());

        System.out.println(listUnica);
        
        //pipeLine

        List<Integer> numeros = new ArrayList<>();
        numeros.add(4);
        numeros.add(5);
        numeros.add(8);
        numeros.add(29);
        numeros.add(53);

        List<Integer> resultado = numeros.stream()
                                         .filter(n -> n % 2 == 0) // filtro de numeros. pares
                                         .map(n -> n * 5) //multiplicação 
                                         .sorted()//ordenação 
                                         .collect(Collectors.toList());

        System.out.println(numeros);
        System.out.println(resultado);
    }

}
