package Desafios.Desafio_Heranca;

public class Carro {
    final int VELOCIDADE_MAXIMA;
    int velocidadeAtual;
    int delta = 5;

    Carro(int velocidadeMaxima)
    {
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    void acelerarCarro()
    {
        if(velocidadeAtual + delta >= VELOCIDADE_MAXIMA)
        {
            velocidadeAtual = VELOCIDADE_MAXIMA;
        }
        else
        {
            velocidadeAtual += delta;
        }
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
