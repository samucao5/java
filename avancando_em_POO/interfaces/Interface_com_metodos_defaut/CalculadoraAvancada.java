package avancando_em_POO;

public class CalculadoraAvancada implements Calculadora {


    @Override
    public int somar(int num1, int num2)
    {
        return num1 + num2;
    };

    @Override
    public int multiplicar(int num1, int num2)
    {
        System.out.println("Multiplicando: ");
        return num1 * num2;
    }

    
}
