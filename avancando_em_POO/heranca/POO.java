package avancando_em_POO;

public class POO {
    public static void main(String[] args) 
    {
        Motor motor_1 = new Motor("V8", 450);
        motor_1.exibirinfoMotor();

        Carro carro_1 = new Carro("Ford", "Mustang", motor_1);
        carro_1.exibirInfoCarro();

        Cachorro fred = new Cachorro("Fred");

        fred.latir();

        fred.emitirSom();

        Animal animal_1 = new Animal("Grilo");

        animal_1.emitirSom();

        //a subclasse tem acesso a tudo da classe superclasse(pai)
        // e a subclasse não tem acesso a classe filha

    }
}
