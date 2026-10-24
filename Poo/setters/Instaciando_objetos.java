package POO;

public class Instaciando_objetos {
    public static void main(String[] args) 
    {
        
    //1 - criar classe
    //criação de Criando_uma_classe.java

    //2 - Instanciar a classe
        Criando_uma_classe carro_1 = new Criando_uma_classe();

    //Acessar props e metodos sintaxe:
    //NomeObjeto.Prop e NomeObjeto.Metodo();

        carro_1.marca = "VW";
        carro_1.modelo = "Fusca";
        carro_1.ano = 2025;


        carro_1.acelerar();

        carro_1.exibir_info();


        Criando_uma_classe carro_2 = new Criando_uma_classe();

        carro_2.marca = "Ferrari";

        carro_2.exibir_info();
    

        carro_1.ligarMotor();

        carro_1.aumentarVelocidade(50);
    
    //Criando propriedades
        Pessoa pessoa_1 = new Pessoa();
    
    // Protegido: pessoa_1.nome = "Pedro";
        pessoa_1.setNome("Samuel");

        System.out.println("seu nome e: " + pessoa_1.getNome());

        pessoa_1.setIdade(20);

        System.out.println("Sua idade e: " + pessoa_1.getIdade());

        conta_bancaria conta_1 = new conta_bancaria();

        //setTitulo 
        conta_1.setTitular(null);
        conta_1.setTitular("fernando");

        //setSaldo
        conta_1.setSaldo(-3241.23);
        conta_1.setSaldo(2324.32);

        //getInfo 
        conta_1.getInfo();
    }
}
