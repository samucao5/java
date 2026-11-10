package classes_e_metodos;

public class ClasseProduto {
    String nome;
    double preco;
    double desconto;

    double preco_com_desconto()
    {
        return preco * (1 - desconto);
    }

    double preco_com_desconto(double desconto_gerente)
    {
        return preco * (1 - (desconto + desconto_gerente));
    } 
}
