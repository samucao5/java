package variaveis;

public class exercicios {
    public static void main(String []args)
    {
        //exercicio 1
        int valor = 10;
        int valor_2 = valor * 2;
        System.out.println(valor_2);

        //exercicio 2
        char letra = 'b';
        System.out.println((int) letra);

        //exercicio 3
        double d1 = 15.75, d2 = 20.40, soma;
        soma = d1 + d2;
        System.out.println(soma);

        //Exercicio 4
        long valor_l = 2000000000;
        int valor_int = (int) valor_l;
        System.out.println(valor_int);

        //Exercicio 5 
        String frase_1 = "Olá, Mundo! ";
        String frase_2 = frase_1 + "Bem-vindo ao java";
        System.out.println(frase_2);

    }
}
