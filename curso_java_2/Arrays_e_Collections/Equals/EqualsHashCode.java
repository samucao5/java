package Arrays_e_collections;

public class EqualsHashCode {
    public static void main(String[] args) {
        Usuario u1 = new Usuario();
        u1.nome = "pedro Silva";
        u1.email = "pedro.silva@ezemail.com.br";

        Usuario u2 = new Usuario();
        u2.nome = "samue felipe";
        u2.email = "samuel.felipe.@ezemail.com.br";

        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));

        System.out.println(u1 == u1);
        System.out.println(u1.equals(u1));
    }

}
