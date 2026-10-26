package avancando_em_POO;

abstract class instrumentoMusical {
    
    protected String nome;

    public instrumentoMusical(String nome)
    {
        this.nome = nome;
    }

    //abstrato: tem que ser implementado na subclasse
    public abstract void tocar();

    //concreto: pode ser herdado
    public void exibirDetalhes()
    {
        System.out.println("nome do instrumento: " + nome);
    }
}
