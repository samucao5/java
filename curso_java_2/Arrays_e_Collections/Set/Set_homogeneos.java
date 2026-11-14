package Arrays_e_collections;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Set_homogeneos
{
    public static void main(String[] args) {
        Set<String> listaFrutas = new HashSet<>();
        listaFrutas.add("laranja");
        listaFrutas.add("melancia");
        listaFrutas.add("maracuja");
        listaFrutas.add("kiwi");

        for(String frutas : listaFrutas)
            {
                System.out.println(frutas);
            }

        SortedSet<String> listaFrutas2 = new TreeSet<>();
        listaFrutas2.add("laranja");
        listaFrutas2.add("melancia");
        listaFrutas2.add("maracuja");
        listaFrutas2.add("kiwi");

        System.out.println("\nexibindo a lista pelo TreeSet \n");

        for(String frutas2 : listaFrutas2)
            {
                System.out.println(frutas2);
            }
        
        SortedSet<Integer> listaIdades = new TreeSet<>();
        listaIdades.add(18);
        listaIdades.add(27);
        listaIdades.add(19);
        listaIdades.add(21);

        System.out.println("\nexibindo a lista pelo TreeSet \n");

        for(Integer idades : listaIdades)
            {
                System.out.println(idades);
            }



    }
}