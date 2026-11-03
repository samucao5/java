package Collections;
import java.util.*;


public class outros_metodos_de_modificacao {
    public static void main(String [] args)
    {
        //modificação
        
        List<Integer> numero = new ArrayList<>();
        //adiciona novo elemento
        numero.add(1);
        numero.add(2);

        System.out.println(numero);

        //remove elemento
        //remove por valor e não por indice, desta maneira
        numero.remove(Integer.valueOf(2));

        //altera todos os elementos
        numero.replaceAll(num -> num * 5);

        System.out.println(numero);

        numero.add(205);
        numero.add(201);
        numero.add(222);

        System.out.println(numero);
        //remoção baseada em condição
        numero.removeIf(n -> n > 200);

        System.out.println(numero);





    }
}
