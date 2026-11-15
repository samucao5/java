package Arrays_e_collections;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {
        ArrayList<frutas> lista = new ArrayList<>();
        frutas lista_fruta = new frutas("laranja");

        lista.add(lista_fruta);
        lista.add(new frutas("tomate"));
        lista.add(new frutas("melancia"));
        lista.add(new frutas("maça"));
        lista.add(new frutas("kiwi"));

        for (frutas f : lista)
            {
                System.out.println(f.nome_fruta);
            }

        System.out.println("\n");

        for (frutas fr : lista)
            {
                System.out.println(fr);
            }
        
        System.out.println("\n" + lista.get(1)); // consegue acessar pelo indice

        System.out.println(">>>> " + lista.remove(1));//consegue remover pelo indice

        System.out.println(lista.remove(new frutas("kiwi")));
        System.out.println("Tem? " + lista.contains(new frutas("kiwi")));

         for (frutas fr : lista)
            {
                System.out.println(fr);
            }
    }
}
