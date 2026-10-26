package avancando_em_POO;

public class pessoa {
    
    private String nome;
    private int idade;

    public pessoa(String nome, int idade)
    {
        this.nome = nome;
        this.idade = idade;
    }

    //Override - sobreescrita
    @Override
    public String toString()
    {
        return "Nome: " + nome + ", idade: " + idade;
    }
}
