package avancando_em_POO;

interface Calculadora {
    
    public int somar(int num1, int num2);

    //ele pode ser utilizado, sem implementação

    default int multiplicar(int num1, int num2)
    {
        return num1 * num2;
    }
}
