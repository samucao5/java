package Collections;
import java.util.*;


public class busca_em_collections {
    public static void main(String[] args) {
        
        List<Integer> numero = new ArrayList<>();
        numero.add(2);
        numero.add(5);
        numero.add(1);
        numero.add(4);
        numero.add(0);

        List <String> produto = new ArrayList<>();
        produto.add("laranja");
        produto.add("tomate");
        produto.add("farofa");
        produto.add("alface");
        produto.add("arroz");

        String produto_1 = "tomate";

        //for
        for(String produtos : produto)
            {
                if(produtos.equals(produto_1))
                    {
                        System.out.println("Produto encontrado: " + produtos);
                    }
            }
        
        //contains 
        boolean encontrou = produto.contains(produto_1);
        System.out.println("O produto " + produto_1  +" foi encontrado? " + encontrou);

        //findAny
        Optional<String> encotrar_qualquer_produto = produto.stream().findAny(); 

        System.out.println(encotrar_qualquer_produto);
        
        //findFirst
        Optional<String> encontrar_o_primeiro_produto = produto.stream().findFirst();

        System.out.println(encontrar_o_primeiro_produto);

        Optional<Integer> encontrar_o_primeiro_numero_par = numero.stream().filter(num -> num % 2 == 0).findFirst();

        System.out.println(encontrar_o_primeiro_numero_par);


        

    }
}
