package Tratamento_de_erros_e_excecoes;

public class banco {
    
    private double saldo;

    public banco(double saldo)
    {
        this.saldo = saldo;
    }

    public void sacar(double valor) throws SaldoInsuficienteException
    {
        if(valor > saldo)
            {
                throw new SaldoInsuficienteException("Saldo insuficiente para sacar: R$" + valor );
            }
        saldo -= valor;

        System.out.println("saque realizado com sucesso, de: " + valor);
    }
}
