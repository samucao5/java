package Desafios.Desafio_Lanchonete;

public class Item {
    int quantidade;
    Produto produto;
    public Item(String nome, Double preco, int quantidade)
    {
        this.produto = new Produto(nome, preco);
        this.quantidade = quantidade;
    }
}
