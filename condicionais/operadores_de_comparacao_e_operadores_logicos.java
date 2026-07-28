package condicionais;

public class operadores_de_comparacao_e_operadores_logicos {
    public static void main(String[] args){
        int numero_1, numero_2;
        boolean resultado = true, bool = false;
        numero_1 = 5;
        numero_2 = 5;
        //== = igual a
        resultado = numero_1 == numero_2;
        System.out.println("Resultado do igual a: " + resultado);
        // != = diferente de
        resultado = numero_1 != numero_2;
        System.out.println("Resultado do diferente de: " + resultado);

        // < = menor que
        resultado = numero_1 < numero_2;
        System.out.println("resultado do menor que: " + resultado);

        // > = maior que
        resultado = numero_1 > numero_2;
        System.out.println("resultado do maior que: " + resultado);

        // <= = menor ou igual
        resultado = numero_1 <= numero_2;
        System.out.println("resultado do menor ou igual: " + resultado);

        // >= = maior ou igual
        resultado = numero_1 >= numero_2;
        System.out.println("resultado do maior que: " + resultado);

        // AND
        resultado = (numero_1 == numero_2) && (bool);
        System.out.println("resultado do AND: " + resultado);

        //OU
        resultado = (numero_1 >= numero_1) || (bool);
        System.out.println("resultado do OU: " + resultado);

        //NOT
        resultado = (numero_1 >= numero_1) && !(bool);
        System.out.println("resultado do NOT: " + resultado);
        

    }
}
