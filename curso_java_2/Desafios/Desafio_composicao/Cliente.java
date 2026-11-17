package Desafios.Desafio_composicao;
import java.util.ArrayList;
import java.util.List;
public class Cliente {
    String nome;
    Compra compra;

    List<Compra> clientes = new ArrayList<>();

    Cliente(String nome)
    {
        this.nome = nome;
        this.compra = new Compra();
    }

    void getRecibo()
    {
        System.out.println("Nome do Cliente: " + this.nome);
        for(Item item : this.compra.compras)
            {
                System.out.printf("Nome do Produto: %s  Preço: R$ %.2f Quantidade: %d\n",
                item.produto.nome, item.produto.preco, item.quantidade);
            }
        
        System.out.printf("preço Total: R$ %.2f", this.compra.getValor());
    }
}


