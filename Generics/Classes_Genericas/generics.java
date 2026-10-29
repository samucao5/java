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

    }
}
