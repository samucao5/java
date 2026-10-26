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

        pessoa pessoa_1 = new pessoa("samuel", 20);
        pessoa pessoa_2 = new pessoa("Allan", 19);
        System.out.println(pessoa_1.toString());

        System.out.println(pessoa_1.equals(pessoa_2));

        System.out.println(pessoa_1.hashCode());

        Quadrado q1 = new Quadrado(4);

        Circulo c1 = new Circulo(4.3);

        System.out.println(q1.calcular_area());
        System.out.println(c1.calcular_area());

        Funcionario funcionario = new Funcionario("Samuel", 1000);
        funcionario.exibirDetalhes();

        Gerente gerente = new Gerente("Allan", 7545.32,1000);

        gerente.exibirDetalhes();

        System.out.println(funcionario.calcularBonus());

        System.out.println(gerente.calcularBonus());


    }
}
