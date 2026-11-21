package Poo;

public class Pessoa {
    private int idade;
    private String nome;
    private String sobrenome;


    public Pessoa(String nome,String sobrenome ,int idade)
    {
        setNome(nome);
        setSobrenome(sobrenome);
        setIdade(idade);

    }

    //Getter
    public int getIdade()
    {
        return idade;
    }

    public String getNome()
    {
        return nome;
    }
    
    public String getSobrenome()
    {
        return sobrenome;
    }

    public String getNomeCompleto()
    {
        return this.getNome() + " " + this.getSobrenome();
    }

    

    //Setter
    public void setIdade(int idade)
    {
        //corta a parte negativa do valor
        idade = Math.abs(idade);
        if(idade > 0 && idade <= 120)
            {
                this.idade = idade;
            }
        else
            {
                System.out.println("Digite uma idade valida");
            }
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome)
    {
        this.sobrenome = sobrenome;
    }


    @Override 
    public String toString()
    {
        return "Ola meu nome e: " + this.getNomeCompleto() + " e tenho " + this.getIdade() + " anos.";
    }
}
