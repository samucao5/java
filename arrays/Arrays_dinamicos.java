import java.util.ArrayList;

public class Arrays_dinamicos {
    //Conceito de Arrays Dinamicos
    //Arrays em java são de tamanhos fixo; arrays dinamicos ajustam o tamanho automaticamente
    //ArrayList é a implementação mais comum de arrays dinamicos
    
    //Adicionar Elementos com ArrayList.add()
    //Permite adicionar elementos ao final do array
    //não requer redimensionamentos manual

    //remover elementos com ArrayList.remove()
    //remove elementos pelo indice ou valor
    //ajusta automaticamente o tamanho do array
    public static void main(String[] args) {

        ArrayList<String> nomes = new ArrayList<>();

        System.out.println(nomes);

        nomes.add("Samuel");
        nomes.add("Pedro");
        nomes.add("Allan");
        nomes.add("Joao");

        for(String nome : nomes)
            {
                System.out.println(nome);
            }
        

        nomes.remove("Pedro");

        System.out.println(nomes);

        //tambem podemos remover pelo indice
        //nomes.remove(0);

        String nome_especifico = nomes.get(0);

        System.out.println("nome especifico: " + nome_especifico);




    }
}
