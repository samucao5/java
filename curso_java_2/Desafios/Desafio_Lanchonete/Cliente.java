package Desafios.Desafio_Lanchonete;
import java.util.ArrayList;
import java.util.List;


public class Cliente {
    Pedido pedido;
    String nome;
    String cpf;

    List<Produto> cliente = new ArrayList<>();

    public Cliente(String nome, String cpf)
    {
        this.nome = nome;
        if (cpf.length() == 11) {
            this.cpf = cpf;
        }
        else
        {
            this.cpf = "11111111111";
        }
        
        this.pedido = new Pedido();
    }

    void getRecibo()
    {
        System.out.println("Nome do cliente: " + this.nome + "\nCpf: " + this.cpf);
        //this.pedido.pedidos = pedido e a lista pedidos
        for(Item item : this.pedido.pedidos)
        {
        System.out.printf("Nome do Produto: %s  Preço: R$ %.2f Quantidade: %d\n", 
        item.produto.nome,
        item.produto.preco,
        item.quantidade);
        }
        
        System.out.printf("valor total do produto: R$ %.2f", this.pedido.valorTotal());
        this.pedido.teve_desconto();
    }
}
