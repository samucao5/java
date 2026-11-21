package Desafios.Desafio_Heranca;

public class TesteCarro {
    public static void main(String[] args) {
        Ferrari ferrari = new Ferrari();
        Fusca fusca = new Fusca();
        ferrari.acelerarCarro();
        ferrari.acelerarCarro();

        ferrari.MonstrarVelocidade();

        ferrari.frearCarro();

        ferrari.MonstrarVelocidade();

        fusca.acelerarCarro();
        fusca.MonstrarVelocidade();

        fusca.frearCarro();
        fusca.frearCarro();
        fusca.MonstrarVelocidade();
        
        


    }
}
