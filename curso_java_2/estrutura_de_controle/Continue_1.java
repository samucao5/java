package estrutura_de_controle;

public class Continue_1 {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++)
            {
                if(i % 2 == 0)
                    {
                        continue;
                    }
                System.out.println(i);
            }
        
            System.out.println("FIM\n\n");

        for(int i = 1; i < 10; i++)
            {
                if(i == 5) continue;
                System.out.println(i);
            }
    }
}
