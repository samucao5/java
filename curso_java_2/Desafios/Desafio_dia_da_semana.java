package Desafios;
import javax.swing.JOptionPane;

public class Desafio_dia_da_semana {
    public static void main(String[] args) {
        String entrada = JOptionPane.showInputDialog("digite um numero entre 1-7: ");
        int dia = Integer.parseInt(entrada);

        if (dia == 1) 
        {
            System.out.println("Domingo");
        }
        else if (dia == 2) 
        {
            System.out.println("Segunda-feira");
        }
        else if (dia == 3) 
        {
            System.out.println("Terça-feira");
        }
        else if (dia == 4) 
        {
            System.out.println("Quarta-feira");
        }
        else if (dia == 5) 
        {
            System.out.println("Quinta-feira");
        }
        else if (dia == 6) 
        {
            System.out.println("Sexta-feira");
        }
        else if (dia == 7) 
        {
            System.out.println("Sabado");
        }
        else
        {
            System.out.println("Valor invalido");
        }
    }
}
