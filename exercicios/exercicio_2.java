package exercicios;
import java.util.*;

public class exercicio_2 {
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        String nome_usuario, usuario_real = "admin";
        int senha, senha_r = 1234;

        System.out.println("digite seu nome de usuario: ");
        nome_usuario = scanner.nextLine();
        System.out.println("Digite sua senha: ");
        senha = scanner.nextInt();

        if((usuario_real.equals(nome_usuario)) && (senha_r == senha))
        {
            System.out.println("Acesso permitido");
        }
        else
        {
            System.out.println("Acesso negado");
        }
    }
}
