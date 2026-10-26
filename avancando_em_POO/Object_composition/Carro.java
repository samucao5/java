package avancando_em_POO;

public class Carro
{
    private String marca;
    private String modelo;
    private Motor motor;

    public Carro(String marca, String modelo, Motor motor)
    {
        this.marca = marca;
        this.modelo = modelo;
        // Propriedade de object composition
        this.motor = motor;
    }

    public void exibirInfoCarro()
    {
        System.out.println("marca do carro: " + marca + "\nmodelo do carro: " + modelo);
        motor.exibirinfoMotor();
    }
}
