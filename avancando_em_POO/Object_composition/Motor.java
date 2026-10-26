package avancando_em_POO;

public class Motor 
{
    private String tipo;
    private int potencia;

    public Motor(String tipo, int potencia)
    {
        this.tipo = tipo;
        this.potencia = potencia;
    }
    
    public void exibirinfoMotor()
    {
        System.out.println("Motor tipo: " + tipo + "\npotencia do motor: " + potencia + " cavalos");
    }
}
