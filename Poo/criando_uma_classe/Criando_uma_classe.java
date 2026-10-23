package POO;

public class Criando_uma_classe {
    /*Criando uma classe
    uma classe e um modelo que define as propriedades e comportamentos de um objeto
    Classes são criadas usando a palavra-chave class
    o nome da classe deve ser um, substantivos e começar com letra maiuscula
    dentro de uma classe deve ser um substantivo e começar com letra maiuscula
    Dentro de uma classe, voce pode definir atributos (propriedades) e metodos (comportamentos);
    Uma classe não faz nada por si só ate que seja instaciada (criação de um objeto)
    */
    
    //atributos ou propriedades
    String marca;
    String modelo;
    int ano;

    //metodos
    void acelerar()
    {
        System.out.println("o carro esta acelerando");
    }

    void exibir_info()
    {
        System.out.println("marca do carro: " + marca + "\nmodelo do carro: " + modelo + "\nano do carro: " + ano);
    }


}
