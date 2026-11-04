package Expressoes_Regulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ultilizando_LookAhed_e_LookBehind_positivo
{
    public static void main(String[] args) {
        //lookahead positivo -> Do que a gente sinalizou para tras 
        String regexLookAhead = "\\d+(?=\\$)";
        String texto = "preço: 100$ $352 533$ $365";

        Pattern pattern = Pattern.compile(regexLookAhead);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("lookahead positivo");
        while (matcher.find())
            {
                System.out.println("Encontrou: " + matcher.group());
            }

        // lookbehind positivo -> para frente do qua a gente definiu 
        String regexLookBehind = "(?<=\\$)\\d+";
        texto = "preço: 100$ $352 533$ $365";

        pattern = Pattern.compile(regexLookBehind);
        matcher = pattern.matcher(texto);

        System.out.println("LookBehind positivo");
        while (matcher.find())
            {
                System.out.println("Encontrou: " + matcher.group());
            }



    }
}