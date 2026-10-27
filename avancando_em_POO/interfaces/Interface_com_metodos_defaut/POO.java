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

        instrumentoMusical instrumento_1 = new Violao("violao");
        instrumentoMusical instrumento_2 = new Bateria("bateria");

        instrumento_1.tocar();
        instrumento_1.exibirDetalhes();

        instrumento_2.tocar();
        instrumento_2.exibirDetalhes();

        Pagamento pagamento_c = new CartaoCredito();

        Pagamento pagamento_t = new TransferenciaBancaria();

        pagamento_c.processarPagamento(534.32);
        pagamento_c.exibirRecibo(534.32);

        pagamento_t.processarPagamento(734.23);
        pagamento_t.exibirRecibo(734.23);

        Documento doc = new Documento("Arquivo de texto");

        doc.instrucaoParaSalvar();

        doc.salvar();

        doc.imprimir();

        CalculadoraAvancada calc = new CalculadoraAvancada();

        System.out.println(calc.somar(3, 2));

        System.out.println(calc.multiplicar(2, 3));




    }
}
