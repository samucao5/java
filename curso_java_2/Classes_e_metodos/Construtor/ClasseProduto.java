package classes_e_metodos;

public class ClasseProduto {
    String nome;
    double preco;
    double desconto;

    public ClasseProduto()
    {
        nome = "usuario";
        preco = 0.0;
        desconto = 0.0;
    }

    public ClasseProduto(String nome_1, double preco_1, double desconto_1)
    {
        nome = nome_1;
        preco = preco_1;
        desconto = desconto_1;
    }

    double preco_com_desconto()
    {
        return preco * (1 - desconto);
    }

    double preco_com_desconto(double desconto_gerente)
    {
        return preco * (1 - (desconto + desconto_gerente));
    } 
}
