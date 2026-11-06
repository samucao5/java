package fundamentos;

public class tipos_primitivos {
    public static void main(String[] args) {
        //Informações do funcionario 

        //Tipos numericos inteiros 

        byte anosDeEmpresa = 23;
        short numerosDeVoos =  542;
        int id = 53431321;
        long pontosAcumulados = 2_124_844_342L;

        //tipos numericos reais 

        float salario = 11_443.44F;
        double venda_acumuladas = 232423.23;

        //tipo booleano
        boolean estaDeFerias = false;

        //tipo caractere 
        char status = 'S';

        //tipo texto
        String nome = "samuel";

        //dias de empresa 
        System.out.println("dias dentro da empresa: " + anosDeEmpresa*385);

        //numeros de viagens:
        System.out.println("numeros de voos: " + numerosDeVoos/2);

        //pontos por real
        System.out.println(pontosAcumulados / venda_acumuladas);
    }
}
