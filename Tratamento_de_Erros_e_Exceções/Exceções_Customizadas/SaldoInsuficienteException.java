package Tratamento_de_erros_e_excecoes;

//toda classe que herda de Exception, tem que enviar pelo menos a mensagem
//getMessage -> mensagem
public class SaldoInsuficienteException extends Exception{
    
    public SaldoInsuficienteException(String mensagem)
    {
        super(mensagem);
    }
}
