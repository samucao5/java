package Desafios;

public class temperatura {
    public static void main(String[] args) {
        double f = 5;
        final double V = 32;
        final double V2 = 5.0/9.0;
        
        double resultado = (f - V) * V2;
        System.out.println("( " + f + " - " + V + ") " + " * " + V2 + " = " + resultado + "°C");
    }
}
