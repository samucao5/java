package POO;

public class funcionario {

    public String nome;
    protected double salario;
    private String senha;

    public funcionario(String nome, double salario, String senha)
    {
        this.nome = nome;
        this.salario = salario;
        this.senha = senha;
    }

    public void exibirDados()
    {
        System.out.println("Nome do funcionario: " + nome + "\nSalario do funcionario: " + salario + "\nsenha de acesso: " + senha);

    }

    protected void aumentarSalario(double porcentagem)
    {
        this.salario += ((this.salario * porcentagem) / 100);
        System.out.println("salario agora e de: " +String.format("R$%.2f", salario));
    }

    public boolean autenticar_senha(String tentativaString)
    {
        return verificarSenha(tentativaString);
    }

    private boolean verificarSenha(String tentativa_senha)
    {
        return this.senha.equals(tentativa_senha);
    }
}
