package Desafios.Desafio_Heranca;

public class Ferrari extends Carro{

    public Ferrari() {
        super(340);
    }
    

    void acelerarCarro()
    {
        super.acelerarCarro();
        super.acelerarCarro();
        super.acelerarCarro();
    }
}
