package variaveis;

public class operadores_aritmeticos{
    public static void main(String [] args){
        //operadores artimeticos

        int valor_1 = 32, valor_2 = 23;

        // + = soma
        int soma = valor_1 + valor_2;
        System.out.println(soma);

        // - = sub
        int sub = valor_1 + valor_2;
        System.out.println(sub);

        // * = multiplicação
        int mult = valor_1 * valor_2;
        System.out.println(mult);

        valor_1 = 4;
        valor_2 = 2;
        // / = divisão
        int div = valor_1 / valor_2;
        System.out.println(div);

        // para ter um resultado quebrado (1.5), pelo menos 1 num da divisão tem que ser double

        System.out.println(10 / 3);

        System.out.println(10.0 / 3);


        // % = modulo pega a sobra
        System.out.println(10 % 3);

        // ++ = Incremento 
        valor_1++;
        System.out.println(valor_1);

        // -- = Decremento
        valor_2--;
        System.out.println(valor_2);

        // += = Atribuição aditiva
        valor_2 += valor_1;
        System.out.println(valor_2);

        // -= = Atribuição subtrativa
        valor_1 -= valor_2;
        System.out.println(valor_1);

    }


}