package POO;

public class PessoaImutavel {
    
    private final String nome;
    private final int idade;

    public PessoaImutavel(String nome, int idade)
    {   
        //não permite alterar pois o dado ja foi enviado, o que mantem isso e o final
        //this.nome = "fernando";
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome()
    {
        return nome;
    }

    public int getidade()
    {
        return idade;
    }
}
