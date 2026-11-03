package Expressoes_Regulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class avancando_em_pattern_e_matcher {
    public static void main(String[] args) {
        // avancando em pattern e matcher

        //correspondencia parcial
        String regex = "\\d{3}";
        String texto = "123ABC456";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("Correspondencia parciais lookingAt");
        if(matcher.lookingAt())
            {
                System.out.println("Encontrado: " + matcher.group());
            }

        //contando grupos com groupCount
        //alem de contar os grupos, a regex precisa estar no texto alvo
        regex = "(\\d{3})-(\\d{3})-(\\d{3})";
        texto = "123-456-712";

        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(texto);

        System.out.println("contando grupos");
        if(matcher.matches())
            {
                System.out.println("total de grupos encontrados: " + matcher.groupCount());
            //mostra todos os grupos 
                for(int i = 0; i <= matcher.groupCount(); i++)
                    {
                        System.out.println("Grupo " + i + " tem o valor de " + matcher.group(i));
                    }
            }
        
        // start e end para obter posição das correspondencias na string
        regex = "\\d{3}";
        texto = "o codigo e 123 e o segundo codigo e 456";

        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(texto);

        System.out.println("Posicao das correspondecias");
        while(matcher.find())
            {
                // quando eu tiver uma ocorrencia, o strart e onde começa e o end e onde termina
                System.out.println("Encontrado: " + matcher.group() + ", começa em " + matcher.start() + " e termina em " + matcher.end());
            }

        // quote para tratar caracteres literais
        String literalRegex = Pattern.quote("1+1=2");
        texto = "A equação correta é 1+1=2 e o resultado do exercicio";
        
        pattern = Pattern.compile(literalRegex);
        matcher = pattern.matcher(texto);
        
        System.out.println("Caracteres literais");
        if(matcher.find())
            {
                System.out.println("encontrado: " + matcher.group());
                System.out.println("foi encontrado " + matcher.start() + " ate o " + matcher.end());
            }

    }
}
