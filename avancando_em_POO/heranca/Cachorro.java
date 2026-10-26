package avancando_em_POO;

public class Cachorro extends Animal{
    
    //é obigado a usar as propriedade da classe pai - super
    public Cachorro(String nome)
    {
        //super -> serve para passar a informação para a classe pai
        super(nome);
    }

    public void latir()
    {
        System.out.println(nome + " esta latindo");
    }
}
