package classes_e_metodos;

public class Data {
    int dia;
    int mes;
    int ano;

    public Data()
    {
        dia = 1;
        mes = 1;
        ano = 1970;
    }

    public Data(int dia_inicial, int mes_inicial, int ano_inicial)
    {
        dia = dia_inicial;
        mes = mes_inicial;
        ano = ano_inicial;
    }

    void imprimirDataFormatada()
    {
        System.out.printf("Data: %d/%d/%d\n", dia, mes, ano);
    }

    String obterDataFormata()
    {
        return String.format("Data: %d/%d/%d", dia, mes, ano);
    }
}
