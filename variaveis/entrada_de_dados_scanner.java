package variaveis;

import java.util.Scanner;

/*
A classe Scanner e utilizada para ler a entrada de dados do usuario via console/terminal 

Parte do pacote java.util: para usar o Scanner, e necessario importar a classe do pacote java.util;

metodos comuns:
nextLine(): le uma linha inteira de texto;

nextInt(): le um valor inteiro;

nextDouble: le um valor decimal (ponto flutuante);

next(): le uma unica palavra;
*/

public class entrada_de_dados_scanner {
    public static void main(String[] args)
    {
        //chamando o scanner
        Scanner scanner = new Scanner(System.in);

        //mensagem para o usuario digitar seu nome
        System.out.println("Digite seu nome: ");

        //resgata o valor no terminal
        String nome = scanner.nextLine();

        //exibe uma mensagem com o valor resgatado
        System.out.println("seu nome e: " + nome);

        System.out.println("digite seu salario: ");
        double salario = scanner.nextDouble();
        System.out.println("seu salario e de: R$" + salario);

        //serve para fechar o scanner e liberar memoria
        scanner.close();

    }
}
