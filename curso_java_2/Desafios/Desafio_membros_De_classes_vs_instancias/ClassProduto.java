package Desafios.Desafio_membros_De_classes_vs_instancias;

public class ClassProduto {
    final String nomeLoja = "loja 25%";
    String nomeProduto;
    double precoProduto;
    static double desconto = 0.25;

    public ClassProduto()
    {
        nomeProduto = "produto sem nome";
        precoProduto = 0;
        desconto = 0.25;
    }

    public ClassProduto(String nome, double preco)
    {
        nomeProduto = nome;
        precoProduto = preco;
        desconto = 0.25;
    }

    public ClassProduto(String nome, double preco, double desconto_novo)
    {
        nomeProduto = nome;
        precoProduto = preco;
        ClassProduto.desconto = desconto_novo;
    }

    double calcular_desconto()
    {
        return precoProduto * (1 - desconto);
    }

    double calcular_desconto(double desconto_gerente)
    {
        return precoProduto * (1 - (desconto + desconto_gerente));
    }

    void exibir_nota()
    {
    System.out.printf(
    "Nota de compra da loja %s%n%n" +
    "Nome do produto: %s%n" +
    "Preço do produto: R$ %.2f%n" +
    "Desconto do produto: %.0f%%%n" +
    "Valor do produto com desconto: R$ %.2f%n",
    nomeLoja,
    nomeProduto,
    precoProduto,
    desconto * 100,
    calcular_desconto()
    );
    }

}
