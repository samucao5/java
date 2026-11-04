package Expressoes_Regulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class utilizando_flags {
    public static void main(String[] args) {
        //Flags

        //CASE_INSENSITIVE - vai ignorar minusculas e maiusculas
        String regex = "java";
        String texto = "Java e uma boa linguagem de programação, java não e tao dificil, JAVA e dificil";

        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(texto);

        while(matcher.find())
            {
                System.out.println("Encontrado: " + matcher.group());
            }

        //Flag MULTILINE (correspondencia por linha)
        regex = "^\\d+";
        texto = "123 este e meu texto\nque pula varias linhas\n653 termina aqui";

        pattern = Pattern.compile(regex, Pattern.MULTILINE);
        matcher = pattern.matcher(texto);

        while(matcher.find())
            {
                System.out.println("Encontrado " + matcher.group());
            }
    }
}
