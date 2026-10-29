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
            System.out.println("Erro: " + e.getMessage());
        }

        // escrever em arquivos
        //FileWriter 

        try(FileWriter writer = new FileWriter(currentDir + "saida.txt"))
        {
            writer.write("escrevendo em arquivos\n");
            writer.write("escrevendo em arquivos 2");
            
        } 
        catch (Exception e) 
        {
            System.out.println("Erro ao escrever arquivos: " + e.getMessage());
        }

        //BufferedWriter
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(currentDir + "saida_2.txt")))
        {
            writer.write("escrevendo em arquivos com o buffered");
            writer.newLine();
            writer.write("escrevendo em arquivos com o buffered 2");
            
        } 
        catch (Exception e) 
        {
            System.out.println("Erro ao escrever arquivos: " + e.getMessage());
        }

        try(BufferedWriter writer = new BufferedWriter(new FileWriter(currentDir + "saida_2.txt", true)))
        {
            writer.append("testando");
            
        } 
        catch (Exception e) 
        {
            System.out.println("Erro ao escrever arquivos: " + e.getMessage());
        }


        // Serializacao de objetos

        Pessoa pessoa = new Pessoa("Samuel", 20);
        System.out.println(pessoa.getNome());

        //serialização 

        //arquivo serializados, tem a extensão .ser
        try(ObjectOutputStream oss = new ObjectOutputStream(new FileOutputStream(currentDir + "pessoa.ser")))
        {
            oss.writeObject(pessoa);

            System.out.println("objeto serializado com sucesso");
        } 
        catch (Exception e) 
        {
            System.out.println("Erro: " + e.getMessage());
        }

    }
}
