package Desafios.Desafio_Lanchonete;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Pedido {
    Scanner sc = new Scanner(System.in);
    Item item;
    double Desconto = 10;
    boolean teve_d = false;
    List<Item> pedidos = new ArrayList<>(); 

    void AdicionarPedido(String nome, double preco, int quantidade)
    {
        Item itens = new Item(nome, preco, quantidade);
        this.pedidos.add(itens);
    }

    double valorTotal()
    {
        double total = 0;
        for(Item item : this.pedidos)
            {
                total += item.produto.preco * item.quantidade;
            }
        
        if (total > 100.00) 
        {
            total = total * (1 -Desconto / 100.0);
            teve_d = true;
        }

        return total;
    }

    void Mudar_Desconto()
    {
        do
        {
        System.out.println("Digite o valor do desconto entre o e 100");
        int desconto = sc.nextInt();
        if(desconto >= 0 && desconto <= 100)
        {
            Desconto = desconto;
            break;
        }
        }while(true);
    }

    void teve_desconto()
    {
        if (teve_d == true) 
        {
            System.out.println("\nteve desconto de " + Desconto + " %" + " na sua compra" );    
        }
        else
        {
            System.out.println("voce não teve nenhum desconto no pedido");
        }
    }
}
