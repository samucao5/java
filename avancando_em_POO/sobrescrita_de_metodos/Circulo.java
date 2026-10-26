package avancando_em_POO;

public class Circulo extends forma{
    
    private double raio;

    public Circulo(double raio)
    {
        this.raio = raio;
    }

    // Sobrescrita => respeita retorno, nome e argumento do metodo 
    @Override 
    public double calcular_area()
    {
        return Math.PI * Math.pow(raio, 2);
    }
}
