package Desafios.Desafio_Heranca;

public class Carro {
    int velocidadeAtual;

    void acelerarCarro()
    {
        velocidadeAtual = velocidadeAtual + 5;
    }

    void frearCarro()
    {
        if(velocidadeAtual < 0)
        {
            velocidadeAtual = velocidadeAtual - 5;
        }
        else
        {
            System.out.println("carro completamento parado");
        }
    }

    void MonstrarVelocidade()
    {
        System.out.println("velocidade atual: " + velocidadeAtual);
    }
}
