package avancando_em_POO;

public class Quadrado extends forma{
    private double lado;

    public Quadrado(double lado)
    {
        this.lado = lado;
    }

    // Sobrescrita => respeita retorno, nome e argumento do metodo 
    @Override 
    public double calcular_area()
    {
        return Math.pow(lado, 2);
    }
}
