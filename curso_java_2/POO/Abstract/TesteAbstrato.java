package Poo.Abstrato;

public class TesteAbstrato {
    public static void main(String[] args) {
        Animal a = new Cachorro();
        Mamifero b = new Cachorro();

        System.out.println(a.mover());
        //System.out.println(a.mamar());
        System.out.println(a.respirar());

        System.out.println(b.mover());
        System.out.println(b.mamar());
        System.out.println(b.respirar());
    }
}
