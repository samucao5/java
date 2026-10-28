package Tratamento_de_erros_e_excecoes;

public class Erros {
    public static void main(String[] args) {
        try 
        {
            int a = 0;
            int b = 20;

            int resultado = b / a;
        } 
        catch (ArithmeticException e)
        {
            System.out.println("divisão por zero não e possivel");
        }

        try {
            int[] numero = {1,2,3};

            System.out.println(numero[3]);
        } catch (Exception error) {
            System.out.println("Erro generico");

            System.out.println("msg: " + error.getMessage());
        }

        //Excessão e o erro => palavras para o mesmo fim
    }
}
