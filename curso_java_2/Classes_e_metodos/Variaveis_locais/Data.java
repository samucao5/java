package classes_e_metodos;

public class Data {
    int dia;
    int mes;
    int ano;

    public Data()
    {
        /*
        dia = 1;
        mes = 1;
        ano = 1970;
        isto e a mesma coisa que o de cima
        */
        this(1,1,1970);
    }

    public Data(int dia, int mes, int ano)
    {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    String obterDataFormata()
    {
        //variavel local
        final String formato = "Data: %d/%d/%d"; 
        return String.format(formato, dia, mes, ano);
    }

    void imprimirDataFormatada()
    {
        System.out.println(this.obterDataFormata());
    }
}
