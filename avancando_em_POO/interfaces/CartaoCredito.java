package avancando_em_POO;

public class CartaoCredito implements Pagamento {
    
    @Override
    public void processarPagamento(double valor)
    {
        System.out.println("Pagamento de R$" + valor + " via cartão de credito" );
    }
}
