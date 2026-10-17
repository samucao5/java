package arrays;

public class sintaxe_dos_arrays {
    public static void main(String [] args)
    {
        int[] numeros = {1,23,4};

        System.out.println("valor do array: " + numeros[0]);

        String[] frutas = new String[3]; 

        frutas[0] = "laranja";
        frutas[1] = "uva";
        frutas[2] = "abacate";

        System.out.println("fruta 1: " + frutas[2]);

        double[] preco = {2.34, 23.4};
        preco[0] = 2.23;
        System.out.println("preco do array: R$ " + preco[0]);
    }
}
