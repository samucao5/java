package Poo;

public class Jogo {
    public static void main(String[] args) {
        Monstro monstro = new Monstro(11,10);
        monstro.x = 20;
        monstro.y = 20;
        Heroi heroi = new Heroi(11,10);
        heroi.x = 20;
        heroi.y = 21;



        System.out.println("vida do monstro ->" + monstro.vida);
        System.out.println("vida do heroi ->" + heroi.vida);

        monstro.atacar(heroi);

        System.out.println("vida do monstro ->" +  monstro.vida);
        System.out.println("vida do heroi ->" + heroi.vida);

        heroi.atacar(monstro);

        System.out.println("vida do monstro ->" + monstro.vida);
        System.out.println("vida do heroi ->" + heroi.vida);

        
        
    }
}
