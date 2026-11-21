package Poo;

public class Monstro extends jogador {
    
    Monstro()
    {
        super(0,0);
    }


    Monstro(int x, int y)
    {
        super(x,y);
    }


    boolean atacar(jogador oponente)
    {
        boolean atacar1 = super.atacar(oponente);
        boolean atacar2 = super.atacar(oponente);
        return atacar1 || atacar2;
    }
}
