package Desafios.DesafioClasseData;

public class Classe_Data {
    int dia;
    int mes;
    int ano;

    void imprimirDataFormatada()
    {
        System.out.printf("Data: %d/%d/%d\n", dia, mes, ano);
    }

    String obterDataFormata()
    {
        return String.format("Data: %d/%d/%d", dia, mes, ano);
    }
}
