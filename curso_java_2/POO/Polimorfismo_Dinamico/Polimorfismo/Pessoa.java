package Poo.Polimorfismo;

public class Pessoa {
    private double peso;

    public Pessoa(double peso)
    {
        setPeso(peso);
    }

    public double getPeso()
    {
        return peso;
    }

    public void setPeso(double peso)
    {
        if(peso >= 0)
        {
            this.peso = peso;
        }else
        {
            System.out.println("digite um peso valido");
        }
    }

    public void comerComida(Comida comida)
    {
        this.peso += comida.getPeso();
    }

    public void verPeso()
    {
        System.out.println("Peso Atual: " + peso + " kg");
    }
}
