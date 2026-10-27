package avancando_em_POO;

interface Imprimivel
{
    void imprimir();
}

interface Salvavel
{
    void salvar();

    default void instrucaoParaSalvar()
        {
            System.out.println("voce deve apertar ctrl + s");
        }
}

public class Documento implements Imprimivel, Salvavel{
    
    private String documento;

    public Documento(String documento)
    {
        this.documento = documento;
    }


    @Override
    public void imprimir()
    {
        System.out.println("Imprimindo o Documento " + documento);
    }

    @Override 
    public void salvar()
    {
        System.out.println("Salvando o Documento " + documento);
    }
}
