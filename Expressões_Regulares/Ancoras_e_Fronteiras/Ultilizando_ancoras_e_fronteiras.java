package Expressoes_Regulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ultilizando_ancoras_e_fronteiras
{
    public static void main(String [] args)
    {
        //^ para o inicio da String
        String regex = "^s";
        String texto = "samuel super sopa";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("Correspondencia para ^s");
        while(matcher.find())
            {
                System.out.println("Encontrado: " + matcher.group());
            }
        
        //$ para o final da String
        String regex_2 = "sopa$";
        String texto_2 = "samuel super sopa";

        Pattern pattern_2 = Pattern.compile(regex_2);
        Matcher matcher_2 = pattern_2.matcher(texto_2);

        System.out.println("Correspondencia para sopa$");
        while(matcher_2.find())
            {
                System.out.println("Encontrado: " + matcher_2.group());
            }

        //fronteira \b -> apenas o que esta entre os //b \\b

        regex = "\\bsamuel\\b";
        texto = "meu nome e samuel";

        Pattern pattern_3 = Pattern.compile(regex);
        Matcher matcher_3 = pattern_3.matcher(texto);

        System.out.println("Correspondencia para \\bsamuel\\b");
        while(matcher_3.find())
            {
                System.out.println("Encontrado: " + matcher_3.group());
            }

        // fronteira \B -> string com fronteira com texto a ser procurado
            
        regex = "\\Bsamuel felipe";
        texto = "meu nome e samuel felipe";

        Pattern pattern_4 = Pattern.compile(regex);
        Matcher matcher_4 = pattern_4.matcher(texto);

        System.out.println("Correspondencia para \\Bsamuel felipe");
        while(matcher_4.find())
            {
                System.out.println("Encontrado: " + matcher_4.group());
            }
    }
}