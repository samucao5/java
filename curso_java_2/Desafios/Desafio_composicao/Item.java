package Desafios.Desafio_composicao;

public class Item 
{
    Produto produto;
    int quantidade;

    public Item(String nome, double preco, int quantidade) 
    {
        this.produto = new Produto(nome, preco);
        this.quantidade = quantidade;
    }
}





