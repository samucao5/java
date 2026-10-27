package avancando_em_POO;

interface Pagamento {
    
    // metodos abstratos
    void processarPagamento(double valor);

    //metodos com default
    default void exibirRecibo(double valor)
    {
        System.out.println("Recibo do pagamento, com valor de R$" + valor);
    }
}
