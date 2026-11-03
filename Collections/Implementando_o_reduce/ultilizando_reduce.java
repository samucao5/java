package Collections;
import java.util.*;

public class ultilizando_reduce {
    public static void main(String[] args) {
        List <Integer> numero = new ArrayList<>();
        numero.add(2);
        numero.add(6);
        numero.add(3);
        numero.add(5);
        numero.add(1);
        
        // reduce
        int soma = numero.stream()
                         .reduce(0, (acumulador, num) -> acumulador + num);
        
                         
        System.out.println(soma);

        List <String> palavras = new ArrayList<>();
        palavras.add("bom");
        palavras.add("dia");
        palavras.add("usuario");

        String frases = palavras.stream()
                                .reduce("", (concatenador, frase_a) -> concatenador + " " + frase_a );

        System.out.println(frases);
    }
}
