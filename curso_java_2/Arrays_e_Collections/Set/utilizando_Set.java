package Arrays_e_collections;

import java.util.HashSet;
import java.util.Set;

public class utilizando_Set
{
    public static void main(String[] args) {
        //ultilizando dados heterogéneo 
        HashSet conjunto = new HashSet();

        conjunto.add(1.2); //double -> Double
        conjunto.add(true); //boolean -> Boolean
        conjunto.add("teste"); //String
        conjunto.add(1); //int -> Integer
        conjunto.add('x'); //char -> Caracter

        System.out.println("Tamanho do conjunto: " + conjunto.size());
        conjunto.add("Teste");
        conjunto.add('X');

        System.out.println("Tamanho do conjunto: " + conjunto.size());

        System.out.println(conjunto.remove("teste"));
        System.out.println(conjunto.remove("Teste"));
        System.out.println(conjunto.remove('X'));

        System.out.println("Tamanho do conjunto: " + conjunto.size());

        System.out.println(conjunto.contains('X'));
        System.out.println(conjunto.contains(1));
        System.out.println(conjunto.contains(true));

        Set nums = new HashSet();

        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(conjunto);

        conjunto.addAll(nums); // união entre dois conjuntos
        System.out.println(conjunto);

        conjunto.clear();
        System.out.println(conjunto);
    }
}