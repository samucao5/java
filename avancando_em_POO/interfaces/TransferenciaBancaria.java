package avancando_em_POO;

public class TransferenciaBancaria implements Pagamento{
    
    @Override
    public void processarPagamento(double valor)
    {
        System.out.println("Pagamento de R$" + valor + " via Transferencia bancaria" );
    }
}
