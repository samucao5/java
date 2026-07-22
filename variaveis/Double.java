package variaveis;

public class Double {
    
    public static void main( String[]args){

        double preco = 6.75;
        float preco_2 = 9.99f;

        System.out.println("preco 1: R$ " + preco);

        System.out.println("preco 2: R$" + preco_2);
        
        double soma = preco + preco_2;
        System.out.println("soma dos precos: R$" + soma);
    }
}
