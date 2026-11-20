package Poo;

public class Monstro extends jogador {
    
    boolean atacar(jogador oponente)
    {
        boolean atacar1 = super.atacar(oponente);
        boolean atacar2 = super.atacar(oponente);
        return atacar1 || atacar2;
    }
}
