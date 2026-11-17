package Poo;
import java.util.ArrayList;


public class Compra {
    String cliente;
    ArrayList<Item> itens = new ArrayList<>();
    
    void adicionarItem(Item item)
    {
        this.itens.add(item);
        item.compra = this;
    }

    void adicionarItem(String nome, int quantidade, double preco)
    {
        this.adicionarItem(new Item(nome, quantidade, preco));
    }

    double getValorTotal()
    {
        double total = 0;

        for(Item item : itens)
            {
                total += item.quantidade * item.preco;
            }

        return total;
    }

    void getRecibo()
    {

        for(Item item : itens)
            {
                System.out.println("nome: " + item.nome + " quantidade: " + item.quantidade + " preco: R$" + item.preco);
            }
        
            System.out.println("total: R$" + this.getValorTotal());
    }


}
