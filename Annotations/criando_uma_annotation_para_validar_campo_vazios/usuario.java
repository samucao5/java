package annotations;

public class usuario {
    @NotEmpty(message= "o campo nome não pode ser vazio")
    private String nome;

    @NotEmpty(message= "o campo email não pode ser vazio")
    private String email;

    public usuario(String nome, String email)
    {
        this.nome = nome;
        this.email = email;
    }

    public String getNome()
    {
        return nome;
    }

    public String getEmail()
    {
        return email;
    }

   
}
