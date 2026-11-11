package classes_e_metodos;

public class AreaCircTeste {
    public static void main(String[] args) {
        AreaCirc a1 = new AreaCirc(6);
        //a1.pi = 10;

        AreaCirc a2 = new AreaCirc(5);
        //a2.pi = 10;

        //AreaCirc.pi = 3.1415;

        System.out.println(a1.area());
        System.out.println(a2.area());
        System.out.println(a1.area(100));
        System.out.println(a1.PI);
        System.out.println(Math.PI);

    }
}
