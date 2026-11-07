package fundamentos;

public class Operadores_Atribuicao {
    public static void main(String[] args) {
        int a = 3;
        int b = a;
        int c = a + b;

        c += b; // c = c + b
        c -= b;// c = c - a
        c *= b;// c = c * b
        c /= a;// c = c + 1;

        System.out.println(c);
    }
}
