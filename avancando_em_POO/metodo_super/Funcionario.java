package avancando_em_POO;

public class Funcionario 
{
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario)
    {
        this.nome = nome;
        this.salario = salario;
    }

    public void exibirDetalhes()
    {
        System.out.println("nome do funcionario: " + nome);
    }

    public double calcularBonus()
    {
        // Math.round() arredonda um número para o inteiro mais próximo.
        // Neste caso, é usado para arredondar o bônus para duas casas decimais.
        return Math.round(salario * 0.1 * 100.0) / 100.0;
    }
}


