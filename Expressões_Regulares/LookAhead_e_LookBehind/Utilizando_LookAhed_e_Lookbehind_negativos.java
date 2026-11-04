package Expressoes_Regulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utilizando_LookAhed_e_Lookbehind_negativos {
    public static void main(String[] args) {
        //lookahead negativo 
        //que vai encontrar palavras qua não tem o (negativo) ponto final
        ///w [a-z] != é
        String regexLookAheadNegativo = "\\w+(?!\\.)";
        String texto = "esta e a frase. E esta é outra";

        Pattern pattern = Pattern.compile(regexLookAheadNegativo);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("lookAhead Negativo");
        while(matcher.find())
            {
                System.out.println("Encontrou: " + matcher.group());
            }
        
        //lookbehind negativo
        //Todas as palavras que não são precedidas por #
        String regexLookBehindNegativo = "(?<!#)\\w+";
        texto = "#java #javascript #php #kotlin";

        pattern = Pattern.compile(regexLookBehindNegativo);
        matcher = pattern.matcher(texto);

        System.out.println("lookAhead Negativo");
        while(matcher.find())
            {
                System.out.println("Encontrou: " + matcher.group());
            }

    }
}
