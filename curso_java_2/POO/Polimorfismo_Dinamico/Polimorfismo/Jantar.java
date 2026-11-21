package Poo.Polimorfismo;

public class Jantar {
    public static void main(String[] args) {
        Pessoa convidado = new Pessoa(65);

        Arroz i1 = new Arroz(0.250);
        Sorvete i2 = new Sorvete(0.400);
        Feijao i3 = new Feijao(0.250);
        convidado.verPeso();

        convidado.comerComida(i1);
        convidado.comerComida(i2);
        convidado.comerComida(i3);

        convidado.verPeso();
    }
}
