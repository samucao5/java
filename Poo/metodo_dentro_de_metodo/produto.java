package POO;

public class produto 
{

    private String nome;
    private Double preco;
    
    public void setNomeProduto(String nome)
    {
        if(nome != null && !nome.isEmpty() && nome.length() > 3)
            {
                this.nome = nome;
            }
        else
            {
                System.out.println("o nome enviado para o produto não atendeu os criterios");
            }
        
    }

    public String getNomeProduto()
    {
        return nome.toUpperCase();
    }


    public void setPrecoProduto(double preco)
    {
        if(preco > 0)
            {
                this.preco = preco;
            }
        else
            {
                System.out.println("O valor do produto deve ser maior que 0");
            }
    }

    public String getPrecoProduto()
    {
        return String.format("R$%.2f", preco);
    }

    public String getProdutoInfo()
    {
        return "Nome do produto: " + this.getNomeProduto() + "\npreco do produto: " + this.getPrecoProduto();
    }

    public void aplicarDesconto (double porcentagem)  
    {
        if(porcentagem > 0 && porcentagem <= 100)
            {
                double desconto = calcularDesconto(porcentagem);

                double preco_final =  this.preco - desconto;

                this.setPrecoProduto(preco_final);

                System.out.println("Desconto de " + porcentagem + "% aplicado");

                System.out.println(this.getProdutoInfo());
            }
        else
            {
                System.out.println("valor para porcentagem invalida.");
            }
    }

    //metodo helper
    private double calcularDesconto(double porcentagem)
    {
        return ((this.preco * porcentagem) / 100);
    }
}
