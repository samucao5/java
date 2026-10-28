package Manipulação_de_arquivo_e_diretorio;
import java.io.*;





public class Arquivo {

    public static void main (String [] args)
    {
        String currentDir = System.getProperty("user.dir") + "\\Manipulação_de_arquivo_e_diretorio\\";

        System.out.println(currentDir);

        // Windows -> \
        // Linux -> /

        //FileReader = caracter por caracter
        //BufferedReader = linha por linha

        //FileReader

        try(FileReader reader = new FileReader(currentDir + "arquivo.txt"))
        {
            int caracter;
            
            while((caracter = reader.read()) != -1)
                {
                    System.out.print((char) caracter);
                }
        }
        catch(Exception e)
        {
            System.out.println("Erro ao ler arquivo: " + e.getMessage());
        }


        //BufferedReader


        try(BufferedReader reader = new BufferedReader(new FileReader(currentDir + "arquivo.txt")))
        {
            String linha;

            while((linha = reader.readLine()) != null)
                {

                    System.out.println("\n" + linha);
                }



        }
        catch(Exception e)
        {

        }
    }
}
