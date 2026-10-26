package avancando_em_POO;

public class Animal {

    protected String nome;
    
    public Animal(String nome)
    {
        this.nome = nome;
    }

    public void emitirSom()
    {
        System.out.println(nome + " está emitindo som");
    }
}
