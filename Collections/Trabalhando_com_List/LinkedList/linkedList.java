package Collections;
import java.util.*;

public class linkedList {
    
    public static void main(String[] args) {
        List<Integer> numeros = new LinkedList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);

        System.out.println("primeiro numero: " + numeros.get(0));

        numeros.remove(0);

        //ver os valores facilmente
        System.out.println(numeros.toString());

        numeros.set(0,22);
        System.out.println(numeros.get(0));

        //as collections tem os mesmos metodos, qualquer uma 
        //mas nem todas, podem aplica-los



    }


}
