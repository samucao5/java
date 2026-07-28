package condicionais;
/*uso do metodo equals():
equals() compara o conteudo das strings, caractere por caractere
é a maneira correta e segura de vericar se duas strings são iguals em valor

equalsIgnoreCase():
Variante de equals() que ignora diferenças entre maiusculas e minusculas;

*/



public class comparacao_de_strings {
    public static void main(String[] args){
        String str1 = "java";
        String str2 = new String("java");
        boolean resultado = true;

        resultado = (str1 == str2);
        System.out.println(resultado);

        resultado = (str1 == "java");
        System.out.println(resultado);

        resultado = (str1.equals(str2));
        System.out.println(resultado);

        resultado = (str2.equals(str1));
        System.out.println(resultado);

        str2 = "JAVA";
        resultado = (str1.equalsIgnoreCase(str2));
        System.out.println(resultado);
    }
}
