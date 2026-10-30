package Generics;

public class generics {
    
    public static void main(String[] args) 
    {
        // classes genericas 
        //quando instaciamos o objeto, agora o T é ALGUMA COISA
        Caixa<Integer> caixaInteira = new Caixa<>();
        
        caixaInteira.adicionar(5);

        System.out.println(caixaInteira.obter());

        Caixa<String> caixaStr = new Caixa<>();

        caixaStr.adicionar("teste");

        System.out.println(caixaStr.obter());

        // metodos genericos 
        System.out.println("Maior valor entre 5 e 10: " + obterMaior(5, 10));

        System.out.println("Maior valor entre java e php: " + obterMaior("java", "php"));

        String[] letras = {"a", "b", "c", "d"};

        Integer[] valores = {12,424,32,13};

        Boolean[] bools = {true, false, false, true};
        imprimirArray(letras);

        imprimirArray(valores);

        imprimirArray(bools);

        Comparador<Integer> comparadorInteiros = new Comparador<>();

        System.out.println("\nMaior numero entra 20 e 10: " + comparadorInteiros.obterMaior(20, 10));

        Comparador<Double> comparadorDouble = new Comparador<>();

        System.out.println("\nMaior numero entra 4.34 e 23.21: " + comparadorDouble.obterMaior(4.34,23.21));

        //da erro de compilação 
        //Comparador<String> comparadorInteiros = new Comparador<>();
    }






    public static <T extends Comparable <T>> T obterMaior(T valor1, T valor2)
    {
        return (valor1.compareTo(valor2) > 0) ? valor1 : valor2;
    }

    public static <S> void imprimirArray(S[] array)
    {

        for(S elementos : array)
            {
                System.out.print(elementos + " ");
            }
    }
}
