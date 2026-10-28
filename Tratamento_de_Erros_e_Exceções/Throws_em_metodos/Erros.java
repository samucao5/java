package Tratamento_de_erros_e_excecoes;
import java.io.*;

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

        try 
        {
            validar_idade(20);
            validar_idade(17);
        }
        catch (Exception e) 
        {
            System.out.println("Erro: " + e.getMessage());
        }

        banco banco_1 = new banco(1000);
        try
        {
            banco_1.sacar(1200);
        }
        catch(Exception e)
        {
            System.out.println("Erro: " + e.getMessage());
        }

        //verificadas e não verificadas
        
        //verificada
        try{
        BufferedReader reader = new BufferedReader(new FileReader("arquivo.txt"));
        String linha = reader.readLine();
        System.out.println();
        }catch(Exception e)
        {
            System.out.println("Erro ao ler arquivo: " + e.getMessage());
        }

        //não verificadas 
        String texto = null;

        //System.out.println(texto.length());

        // 6 - throw em metodos

        try
        {
            processarArquivos("System.txt");
        } 
        catch (FileNotFoundException e) 
        {
            System.out.println("Erro: " + e.getMessage());
        }
        catch(IOException e)
        {
            System.out.println("Erro: " + e.getMessage());
        }

    }

    public static void validar_idade(int idade)
        {
            if(idade < 18)
                {
                    throw new IllegalArgumentException("Idade menor que 18 anos");
                }

            System.out.println("Idade valida: " + idade);
        }

        
    public static void processarArquivos(String caminho) throws FileNotFoundException, IOException
    {
        if(caminho == null || caminho.isEmpty())
            {
                throw new IOException("caminho invalido");
            }
        
            File arquivo = new File(caminho);

            if(!arquivo.exists())
                {
                    throw new FileNotFoundException("Arquivo não encontrado");
                }

            System.out.println("Arquivo encontrado com sucesso");
    }   

}   

