package avancando_em_POO;

public class Bateria extends instrumentoMusical{
    
    public Bateria(String nome)
    {
        super(nome);
    }

    @Override 
    public void tocar()
    {
        System.out.println("Batendo os tambores da " + nome);
    };
}
