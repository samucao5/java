package fundamentos;

public class Operadores_logicos {
    public static void main(String[] args) {
        boolean condicao_1 = true;
        boolean condicao_2 = 3 > 7;

        System.out.println(condicao_1 && !condicao_2);
        System.out.println(condicao_1 || condicao_2);
        System.out.println(condicao_1 ^ condicao_2);
        System.out.println(!condicao_1);
        System.out.println(!condicao_2);

        System.out.println("Tabela verdade E (AND &&)");
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        System.out.println("Tabela verdade OU (OR ||)");
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        System.out.println("Tabela verdade OU Exclusivo (XOR ^)");
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);

        System.out.println("Tabela verdade NOT (!)");
        System.out.println(!true);
        System.out.println(!false);
    }
}
