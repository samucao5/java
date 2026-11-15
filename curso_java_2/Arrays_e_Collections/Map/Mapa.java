package Arrays_e_collections;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        Map<Integer, String> usuarios = new HashMap<>();
        usuarios.put(1, "Yasmin");
        usuarios.put(2, "Maria f");
        usuarios.put(3, "Isa");
        usuarios.put(4, "Anabelle");
        usuarios.put(5, "Samuel");

        System.out.println(usuarios.size());
        System.out.println(usuarios.isEmpty());

        //exibe somente as chaves
        System.out.println(usuarios.keySet());

        //exibe somente os valores
        System.out.println(usuarios.values());

        //exibe os dois
        System.out.println(usuarios.entrySet());
        //verifica se contem a chave neste caso o numero 3
        System.out.println(usuarios.containsKey(3));

        //verifica se contem o valor neste caso "Samuel"
        System.out.println(usuarios.containsValue("Samuel"));
        //pega o valor pelo numero da chave
        System.out.println(usuarios.get(5));

        //percorre as chaves
        for(int chave : usuarios.keySet())
            {
                System.out.println(chave);
            }

        //percorre os valores
        for(String valor : usuarios.values())
            {
                System.out.println(valor);
            }
        
        //remove o samuel
        usuarios.remove(5);
        //percorre os dois juntos

        for(Map.Entry<Integer, String> registro : usuarios.entrySet())
            {
                System.out.println("id: " + registro.getKey() + " nome: " + registro.getValue());
                
            }

    }
}
