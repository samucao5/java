package Desafios.Desafio_composicao;

public class ClientesTeste {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Samuel");

        cliente.compra.adicionarItens("laranja", 2.54, 5);
        cliente.compra.adicionarItens("melancia", 5.99, 1);
        cliente.compra.adicionarItens("caneta", 2.42, 7);

        cliente.getRecibo();
    }
}
