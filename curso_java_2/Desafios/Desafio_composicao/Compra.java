package Desafios.Desafio_composicao;
import java.util.ArrayList;
import java.util.List;

public class Compra {
    Item itens;
    List<Item> compras = new ArrayList<>();

    void adicionarItens(String nome, Double preco, int quantidade)
    {
        Item item = new Item(nome, preco, quantidade);
        this.compras.add(item);
    }

    double getValor()
    {
        double total = 0;
        for(Item itens : this.compras)
            {
                total += itens.quantidade * itens.produto.preco;
            }
        
            return total;
    }
}
