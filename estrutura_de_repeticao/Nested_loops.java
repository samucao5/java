package estrutura_de_repeticao;

public class Nested_loops {
    public static void main(String[] args) {
        for(int m = 1; m <= 3; m++)
            {
                System.out.println("EXTERNO");

                for(int n = 1; n <= 3; n++)
                    {
                        System.out.println(m + " x " + n + " = " + (m * n));
                    }

            }
    }
}
