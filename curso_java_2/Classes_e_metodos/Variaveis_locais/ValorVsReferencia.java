package classes_e_metodos;

public class ValorVsReferencia {
    public static void main(String[] args) {
        double a = 2;
        double b = a;// atribuição por valor (Tipo primitivo)

        a++;
        b--;

        System.out.println(a + " " + b);

        Data d1 = new Data();
        Data d2 = d1;//atribuição por referencia

        d1.dia = 31;
        d2.mes = 12;
        d2.ano = 2025;

        System.out.println(d1.obterDataFormata());
        System.out.println(d2.obterDataFormata());

        voltarDataParaValorPadrao(d1);

        System.out.println(d1.obterDataFormata());
        System.out.println(d2.obterDataFormata());

        int c = 5;
        AlterarPrimitivo(c);
        System.out.println(c);
    }

    static void voltarDataParaValorPadrao(Data d)
    {
        d.dia = 1;
        d.mes = 1;
        d.ano = 1970;
    }

    static void AlterarPrimitivo(int d)
    {
        d++;
    }
}
