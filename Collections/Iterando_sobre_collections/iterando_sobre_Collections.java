package Collections;
import java.util.*;

public class iterando_sobre_Collections {
    
    public static void main(String[] args) {
        List<String> nome = new ArrayList<>();

        nome.add("samuel");
        nome.add("Joao");
        nome.add("Allan");

        System.out.println(nome);

        for(String nomes : nome)
            {
                System.out.println(nomes);
            }

        //Iterator
        Iterator<String> nomesIterator = nome.iterator();

        //remover um elemento
        while(nomesIterator.hasNext())
            {
                String nome_r = nomesIterator.next();

                if(nome_r.equals("samuel"))
                    {
                        nomesIterator.remove();
                    }
            }

        System.out.println(nome);

        //ListIterator
        ListIterator<String> listIteratornomes = nome.listIterator();
        
        //ordem normal
        while(listIteratornomes.hasNext())
            {
                System.out.println("Nome: " + listIteratornomes.next());
            }
        
        //ordem contraria(de tras para frente)
        while(listIteratornomes.hasPrevious())
            {
                System.out.println("Nome: " + listIteratornomes.previous());
            }
    }
}
