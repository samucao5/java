package Poo;

public class CompraTeste {
    public static void main(String[] args) {
        Compra c1 = new Compra();

        c1.adicionarItem(new Item("borracha", 5, 2.50));
        c1.adicionarItem("tapete", 7, 20.43);
        c1.itens.add(new Item("caneta", 5, 3.64));
        c1.itens.add(new Item());
        c1.itens.add(new Item("apontador", 1, 4.59));

        System.out.println(c1.itens.size());
        System.out.println(c1.getValorTotal());

        c1.getRecibo();
    }
}
