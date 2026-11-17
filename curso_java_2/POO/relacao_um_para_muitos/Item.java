package Poo;

public class Item {
    String nome;
    int quantidade;
    double preco;
    Compra compra;


    
    public Item()
    {
        this("Item sem nome", 0, 0.0);
    }

    public Item(String nome, int quantidade, double preco)
    {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;

    }
}
