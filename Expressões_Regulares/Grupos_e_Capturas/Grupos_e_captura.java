package Expressoes_Regulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Grupos_e_captura {
    public static void main(String[] args) {
        String regex = "(\\d{2})-(\\d{2})-(\\d{4})"; // (DD)-(MM)-(AAAA)
        String texto = "A data de hoje é 03-11-2026 e a data de ontem foi 02-11-2026";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("correspondencia de grupo");
        while(matcher.find())
            {
                System.out.println("Dia: " + matcher.group(1));
                System.out.println("Mês: " + matcher.group(2));
                System.out.println("Ano: " + matcher.group(3));
                System.out.println("todos os grupos: " + matcher.group(0)); // 0 = Todos os grupos
            }

        // Backreference para substituição
        // $1 = grupo 1, $2 = grupo 2 ....
        String textoSubstituido = texto.replaceAll("(\\d{2})-(\\d{2})-(\\d{4})", "$3/$2/$1");

        System.out.println("texto apos substituiçã: " + textoSubstituido);


    }   
}
