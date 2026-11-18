package Desafios.Desafio_Lanchonete;

public class ClienteTeste {
    public static void main(String[] args) {
        Cliente cliente_1 = new Cliente("samuel", "11211111111");
        cliente_1.pedido.AdicionarPedido("batata", 5.34, 7);
        cliente_1.pedido.AdicionarPedido("hamburguer", 10, 7);

        cliente_1.getRecibo();
    }
}
