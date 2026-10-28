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
        // finally 

        try {
            int[] numero = {1,2,3};

            System.out.println(numero[3]);
        } 
        catch (ArrayIndexOutOfBoundsException error) 
        {
            System.out.println("Erro generico finally");

            System.out.println("msg: " + error.getMessage());
        }
        finally
        {
            System.out.println("Executou o finally");
        }

        try {
            int[] numero = {1,2,3};

            System.out.println("Acessando indice existente: " + numero[2]);
        } 
        catch (ArrayIndexOutOfBoundsException error) 
        {
            System.out.println("Erro generico finally");

            System.out.println("msg: " + error.getMessage());
        }
        finally
        {
            System.out.println("Executou o finally");
        }

    }
}
