package Generics;

import java.util.ArrayList;
import java.util.List;

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

        //4 - wildcard
        List<Integer> numeros2 = List.of(1,2,3);
        List<String> nomes = List.of("samuel","pedro","Allan", "Joao");

        //aceita qualquer tipo de lista de (?)
        imprimirLista(numeros2);
        imprimirLista(nomes);

        //aceita listas numericas (? extends Number)
        System.out.println("soma total: " + somarNumeros(numeros2));


        //aceita somente tipos numericos especificos
        //Number > Integer (5,4,3)
        List<Integer> numeros3 = new ArrayList<>();

        //adicionarNumeros aceita apenas lista de inteiros 
        AdicionarNumeros(numeros3);

        for(Integer numero : numeros3)
            {
                System.out.println(numero);
            }
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

    public static void imprimirLista(List<?> lista)
    {
        for(Object elemento : lista)
            {
                System.out.println(elemento);
            }
    }

    public static double somarNumeros(List<? extends Number> lista)
    {
        double soma = 0;

        for(Number numero : lista)
            {
                soma += numero.doubleValue();
            }
        
        return soma;
    }

    public static void AdicionarNumeros(List<? super Integer>lista)
    {
        for(int i = 1; i <= 5; i++)
            {
                lista.add(i);
            }
    }
}
