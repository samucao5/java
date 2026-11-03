package Collections;
import java.util.*;
public class ultilizando_map {
    
    public static void main(String[] args)
    {
        
    // map 

    // HashMap

    Map<String, Double> produtos = new HashMap<>();

    //adicionar no map com put
    produtos.put("laranja", 6.56);
    produtos.put("feijao", 7.04);
    produtos.put("batata", 4.99);
    produtos.put("cenoura", 5.99);

    System.out.println(produtos);

    //map com chaves iguais, atualiza valor
    produtos.put("laranja", 3.43);

    System.out.println(produtos);

    System.out.println("preço do produto: R$" + produtos.get("cenoura"));

    //remove elementos
    produtos.remove("feijao");

    System.out.println(produtos);
    
    //encontrando por chave, e por valor
    System.out.println(produtos.containsKey("feijao"));
    System.out.println(produtos.containsValue(5.99));

    // exibe valores 
    System.out.println(produtos.entrySet());

    // LinkedHashMap
    Map<String, String> capitalMap = new LinkedHashMap<>();
    capitalMap.put("Brasil","Brasilia");
    capitalMap.put("Argentina","Buenos Aires");
    capitalMap.put("França","Paris");
    
    System.out.println(capitalMap); 
    System.out.println(capitalMap.entrySet());

    System.out.println(capitalMap.containsKey("Brasil"));
    System.out.println(capitalMap.containsValue("Paris"));
    
    //TreeMap - reordena itens
    Map <String, Integer> Idade = new TreeMap<>();
    Idade.put("Samuel", 20);
    Idade.put("Allan", 19);
    Idade.put("Joao", 18);

    System.out.println(Idade);
    System.out.println(Idade.containsKey("Samuel"));


}

    
}
