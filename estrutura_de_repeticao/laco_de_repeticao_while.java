package estrutura_de_repeticao;
import java.util.Scanner;

public class laco_de_repeticao_while {
    
    public static void main(String []args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite um valor para a vida do boss: ");
        int vida = scanner.nextInt();
        batalha(vida);

    }

    public static void batalha(int v)
    {
        int i = 0; 
        while(i <= v)
            {
                int dano = 0;
                dano = (int)(Math.random() * 10);
                System.out.println("dano: " + dano );
                i += dano;
                System.out.println("vida restante do boss: " + (v - i));

                if(i >= v)
                    {
                        System.out.println("voce ganhou a batalha contra o boss parabens");
                    }
            }

    };
}
