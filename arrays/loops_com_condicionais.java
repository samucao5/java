import java.util.Scanner;

public class loops_com_condicionais {
    public static void main(String [] args)
    {
        boolean busca = false;
        String[] cursos = {"administracao", "informatica", "eletrica", "automacao"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite qual curso voce esta procurando: ");
        String nome_curso = scanner.nextLine();

        for(int i = 0; i < cursos.length; i++)
            {
                if(cursos[i].equals(nome_curso))
                {
                    System.out.println("O Curso " + cursos[i] + " foi encontrado");
                    busca = true;
                }
            }
        if(busca == false)
            {
                System.out.println("O Curso " + nome_curso + " esta indisponivel");
            }

        int[] idade = {12, 29, 18, 20, 35};
        int s = 0, idade_m = 18;
        while(s < idade.length)
            {
                if(idade[s] >= idade_m)
                    {
                        System.out.println("a pessoa " + (s + 1) + " e maior de idade ");
                    }
                
                s++;
            }

    }
}
