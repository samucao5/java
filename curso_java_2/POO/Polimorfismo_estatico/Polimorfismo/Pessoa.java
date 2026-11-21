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

    public void comerArroz(Arroz arroz)
    {
        this.peso += arroz.getPeso();
    }

    public void comerFeijao(Feijao feijao)
    {
        this.peso += feijao.getPeso();
    }

    public void comerSorvete(Sorvete sorvete)
    {
        this.peso += sorvete.getPeso();
    }

    public void verPeso()
    {
        System.out.println("Peso Atual: " + peso + " kg");
    }
}
