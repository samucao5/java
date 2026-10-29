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
