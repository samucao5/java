package POO;

public class conta_bancaria {
    
    private String titular;
    private double saldo;

    public void setTitular(String tt)
    {
        //logica para validar ou manipular
        if(tt != null && !tt.isEmpty())
        {
            this.titular = tt;
        }
        else
        {
            System.out.println("Nome do titular invalido");
        }
    }

    public void setSaldo(double s)
    {
        if(s >= 0)
        {
            this.saldo = s;        
        }
        else
        {
            System.out.println("o valor nao pode ser negativo");
        }

    }

    public void getInfo()
    {
        System.out.println("nome do titular: " + titular + "\nSaldo disponivel: R$ " + saldo);
    }
}
