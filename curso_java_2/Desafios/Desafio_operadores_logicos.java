package Desafios;

public class Desafio_operadores_logicos {
    public static void main(String[] args) {
        boolean trabalho_terca = false;
        boolean trabalho_quinta = false;

        boolean tv_50 = trabalho_terca && trabalho_quinta;
        boolean tv_32 = trabalho_terca || trabalho_quinta && !tv_50;
        boolean sorvete = trabalho_terca || trabalho_quinta;
        boolean ficar_em_casa = !sorvete;
        boolean saudavel = !sorvete;

        System.out.println("Trabalho de terca: " + trabalho_terca);
        System.out.println("Trabalho de quinta: " + trabalho_quinta);
        System.out.println("Tv de 50: " + tv_50);
        System.out.println("Tv de 32: " + tv_32);
        System.out.println("Sorvete: " + sorvete);
        System.out.println("ficar em casa: " + ficar_em_casa);
        System.out.println("ficou mais saudavel: " + saudavel);
    }
}
