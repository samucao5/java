package Manipulação_de_arquivo_e_diretorio;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;


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
        //Serializar = OUTPUT


        try(ObjectOutputStream oss = new ObjectOutputStream(new FileOutputStream(currentDir + "pessoa.ser")))
        {
            oss.writeObject(pessoa);

            System.out.println("objeto serializado com sucesso");
        } 
        catch (Exception e) 
        {
            System.out.println("Erro ao serializar: " + e.getMessage());
        }

        //deserialização
        //DESERIALIZACAO = INPUT

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(currentDir + "pessoa.ser")) )
        {
            Pessoa pessoa_2 = (Pessoa) ois.readObject();

            System.out.println("Nome: " + pessoa_2.getNome());
            System.out.println("Nome: " + pessoa_2.getIdade());
        }
        catch(Exception e)
        {
            System.out.println("Erro ao deserializar: " + e.getMessage());
        }

        // manipulação de binario
        
        try(
            FileInputStream fis = new FileInputStream(currentDir + "yosuke.jpg");
            FileOutputStream fos = new FileOutputStream(currentDir + "copia_yosuke.jpg");
           ) 
        {

            int byteData;

            while((byteData = fis.read()) != -1)
                {
                    fos.write(byteData);
                }

                System.out.println("Arquivo copiado com sucesso");

        } catch (Exception e)
        {
            System.out.println("Erro de arquivo: " + e.getMessage());
        }

        //copia de video com buffer

        try(
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(currentDir + "barril.mp4"));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(currentDir + "copia_barril.mp4"));
        )
        {
            byte[] buffer = new byte[1024]; //buffer 1kb em 1kb
            int byteslidos;

            while((byteslidos = bis.read(buffer)) != -1)
                {
                    bos.write(buffer, 0, byteslidos);
                }
            
            System.out.println("Video copiado com sucesso");


        } 
        catch (Exception e) 
        {
            System.out.println("erro do arquivo: " + e.getMessage());
        }

        //manipulação de imagem

        //imagem.jpg e colocar um texto no centro

        try 
        {
            BufferedImage imagem = ImageIO.read(new File(currentDir + "yosuke.jpg"));

            if(imagem == null)
                {
                    System.out.println("A imagem não pode ser carregada");
                    return;
                }

            Graphics2D g2d = imagem.createGraphics();

            g2d.setFont(new Font("Arial", Font.BOLD,50));
            FontMetrics fm = g2d.getFontMetrics();
            String texto = "Samuel";

            // centralizar texto na imagem
            int larguraTexto = fm.stringWidth(texto);
            int AlturaTexto = fm.getHeight();

            //posicionamento
            int x = (imagem.getWidth() - larguraTexto) / 2;
            int y = (imagem.getHeight() - AlturaTexto) / 2 + fm.getAscent();

            //desenhar retangulo
            g2d.setColor(Color.BLACK);
            g2d.fillRect(x - 10, y - fm.getAscent(), larguraTexto + 20, AlturaTexto);

            //desenhar o texto em cima do retangulo
            g2d.setColor(Color.green);
            g2d.drawString(texto, x, y);

            //liberacao de recursos 
            g2d.dispose();

            //salvar a imagem
            File outputFile = new File(currentDir + "imagemModificada.jpg");

            ImageIO.write(imagem, "jpg", outputFile);

            System.out.println("a imagem foi gerada");
        }
        catch (Exception e) 
        {
            System.out.println("ocorreu um problema na imagem: " + e.getMessage());
        }
    }
}
