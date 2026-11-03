package Collections;
import java.util.*;

public class Ordenacao_com_comparator {
    public static void main(String[] args) {
         // ordenação com comparator 

        List<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(new Pessoa("Samuel", 21));
        pessoas.add(new Pessoa("João", 18));
        pessoas.add(new Pessoa("Allan", 19));
        pessoas.add(new Pessoa("Yasmin", 23));
        pessoas.add(new Pessoa("Isa", 20));
        pessoas.add(new Pessoa("Isa", 18));
        

        //ordenar pelo nome
        //ordenar pela ordem alfabetica
        pessoas.sort(Comparator.comparing(Pessoa::getNome));

        for(Pessoa pessoa : pessoas)
            {
                System.out.println(pessoa);
            }
        
        //ordenar pelo nome 
        //ordenar pelo nome e idade
        System.out.println("\n\n");
        pessoas.sort(Comparator.comparing(Pessoa::getNome)
                               .thenComparing(Pessoa::getIdade));
        
        for(Pessoa pessoa : pessoas)
            {
                System.out.println(pessoa);
            }

    }
}
