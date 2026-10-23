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
    

    }
}
