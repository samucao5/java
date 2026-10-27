package avancando_em_POO;

public class Violino extends instrumentoMusical {
    
    public Violino(String nome)
    {
        super(nome);
    }



    @Override 
    public void tocar()
    {
        System.out.println("Agora estamos tocando o " + nome);
    }
}
