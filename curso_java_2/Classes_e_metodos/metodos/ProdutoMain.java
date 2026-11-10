package classes_e_metodos;

public class ProdutoMain {
    public static void main(String[] args) {
        
        ClasseProduto produto_1 = new ClasseProduto();
        produto_1.nome = "Celular";
        produto_1.preco = 2123.23;
        produto_1.desconto = 0.25;

        var produto_2 = new ClasseProduto();
        produto_2.nome = "computador";
        produto_2.preco = 3323.42;
        produto_2.desconto = 0.32;
        
        System.out.println("nome do produto: " + produto_1.nome + "\npreco do produto: R$" + produto_1.preco + "\ndesconto do produto: " + produto_1.desconto * 100 + "%");
        System.out.println("\nnome do produto: " + produto_2.nome + "\npreco do produto: R$" + produto_2.preco + "\ndesconto do produto: " + produto_2.desconto * 100 + "%");

        double precoFinal1 = produto_1.preco_com_desconto();
        double precoFinal2 = produto_2.preco_com_desconto(0.4);
        double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;

        System.out.printf("media do carrinho = R$%.2f.", mediaCarrinho);
    }
}
