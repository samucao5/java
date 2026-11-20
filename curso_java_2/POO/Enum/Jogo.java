package Poo;

public class Jogo {
    public static void main(String[] args) {
        jogador j1 = new jogador();
        j1.x = 20;
        j1.y = 20;

        j1.andar(Direcao.NORTE);
        j1.andar(Direcao.LESTE);
        j1.andar(Direcao.SUL);
        j1.andar(Direcao.OESTE);

        System.out.println(j1.y);
        System.out.println(j1.x);
        
    }
}
