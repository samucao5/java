package funcoes;

public class funcoes_de_string {
    public static void main(String[] args)
    {
        String frase = "java e muito bom";

        //length
        System.out.println(frase.length());

        //começa pelo 0 e termina ate 4
        System.out.println(frase.substring(0,4));

        //deixa a letra maiuscula
        System.out.println(frase.toUpperCase());

        //deixa a letra minuscula
        System.out.println(frase.toLowerCase());

        //troca to os "a" por "e"
        System.out.println(frase.replace("a", "e"));

    }


}
