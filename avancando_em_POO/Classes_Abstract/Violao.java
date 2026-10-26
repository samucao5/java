package avancando_em_POO;

//Não tem herança propriamente dita
//mas tem que usar o extends
public class Violao extends instrumentoMusical {
    
    public Violao(String nome)
    {
        super(nome);
    }

    @Override
    public void tocar()
    {
        System.out.println("Tocando as Cordas do " + nome);
    };
}
