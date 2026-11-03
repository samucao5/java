package Collections;
import java.util.*;
import java.util.stream.*;

public class filtrando_Collections {
    
    public static void main(String[] args) {
        //filter

        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(4);
        numeros.add(5);
        numeros.add(3);
        numeros.add(2);
        numeros.add(6);

        //filtro
        List<Integer> numerosFiltrados = numeros.stream().filter(numero -> numero > 3).collect(Collectors.toList());

        /*o recomendado para fazer para melhor visualização do codigo
        List<Integer> numerosFiltrados = numeros.stream()
                                                .filter(numero -> numero > 3)
                                                .collect(Collectors.toList());
        */

        System.out.println(numeros);
        System.out.print(numerosFiltrados);                                     


    }
}
