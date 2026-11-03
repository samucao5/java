package Expressoes_Regulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Quantificadores {
    public static void main(String[] args) {
        // quantificadores 
        //exp. reg, text, ver se no texto há a exp. reg
        String regex = "a*"; //zero ou mais "a"

        String texto = "b aaab aa ba";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("Correspondencias para a*");

        while(matcher.find())
            {
                //find = encontrar algo na string
                System.out.println("'" + matcher.group() + "'");
            }

        String regex_2 = "a+"; //uma ou mais "a"

        String texto_2 = "b aaab aa ba";

        Pattern pattern_2 = Pattern.compile(regex_2);
        Matcher matcher_2 = pattern_2.matcher(texto_2);

        System.out.println("Correspondencias para a+");

        while(matcher_2.find())
            {
                //find = encontrar algo na string
                System.out.println("'" + matcher_2.group() + "'");
            }


        String regex_3 = "a{2,4}"; //2 a 4 "a"

        String texto_3 = "b aaab aa ba";

        Pattern pattern_3 = Pattern.compile(regex_3);
        Matcher matcher_3 = pattern_3.matcher(texto_3);

        System.out.println("Correspondencias para a{2,4}");

        while(matcher_3.find())
            {
                //find = encontrar algo na string
                System.out.println("'" + matcher_3.group() + "'");
            }

        String regex_4 = "a{2}"; //2 "a"

        String texto_4 = "b aaab aa ba";

        Pattern pattern_4 = Pattern.compile(regex_4);
        Matcher matcher_4 = pattern_4.matcher(texto_4);

        System.out.println("Correspondencias para a{2}");

        while(matcher_4.find())
            {
                //find = encontrar algo na string
                System.out.println("'" + matcher_4.group() + "'");
            }
    }
}
