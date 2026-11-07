package fundamentos;

public class tipoString {
    public static void main(String[] args) {
        
    System.out.println("ola samuel".charAt(0));

    String s = "Boa tarde";
    System.out.println(s.concat("!!!!"));
    System.out.println(s + "!!!");
    //começa com - retorna um valor booleano
    System.out.println(s.startsWith("Boa"));
    System.out.println(s.toLowerCase().startsWith("boa"));
    //termina com - retorna um valor booleano
    System.out.println(s.toUpperCase().endsWith("TARDE"));

    System.out.println(s.length());
    
    //.equals: verifica se a frase e igual, verifica a case
    System.out.println(s.equals("boa tarde"));
    
    //.equalsIgnoreCase(): verifica se a frase e igual, não se importa com a case
    System.out.println(s.equalsIgnoreCase("boa tarde"));

    var nome = "Samuel";
    var sobrenome = "Felipe";
    var idade = 21;
    var salario = 5231.42;

    System.out.println("\nNome: " + nome + "\nSobrenome: " + sobrenome + "\nidade: " + idade + "\nsalario: R$" + salario);
    
    System.out.printf("Nome: %s %s tem %d anos e ganha R$%.2f", nome, sobrenome, idade, salario);

    String frase = String.format("\nNome: %s %s tem %d anos e ganha R$%.2f", nome, sobrenome, idade, salario);

    System.out.println(frase);
    
    //.contains(): se a frase contem alguma coisa
    System.out.println("Frase qualquer".contains("qual"));
    
    //.indexOf(): verifica aonde esta o começo desta frase
    System.out.println("Frase qualquer".indexOf("qual"));
    
    //.substring(): exibe a frase que começa no exemplo abaixo 6
    System.out.println("Frase qualquer".substring(6));
    
    //.substring(): exibe a frase que começa no exemplo abaixo 6 e termina no caso o 10
    System.out.println("Frase qualquer".substring(6, 10));
    }
}
