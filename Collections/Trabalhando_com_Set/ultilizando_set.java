package Collections;
import java.util.*;

public class ultilizando_set
{
    public static void main(String[] args) {
        
        //reordena a ordem dos elementos
        Set<String> idiomas = new HashSet<>();

        idiomas.add("Portugues");
        idiomas.add("ingles");
        idiomas.add("mandarim");
        idiomas.add("espanhol");

        System.out.println(idiomas);

        System.out.println(idiomas.contains("ingles"));

        //mantem a ordem
        Set<Integer> numeros = new LinkedHashSet<>();

        numeros.add(3);
        numeros.add(2);
        numeros.add(5);
        numeros.add(1);
        numeros.add(7);

        System.out.println(numeros);

        //TreeSet - reordena elementos

        Set<String> estacoes_do_ano = new TreeSet<>();
        estacoes_do_ano.add("Primavera");
        estacoes_do_ano.add("Verao");
        estacoes_do_ano.add("Outono");
        estacoes_do_ano.add("Inverno");

        System.out.println(estacoes_do_ano);

        //Set não tem get
        //System.out.println(estacoes_do_ano.get());

    }


}