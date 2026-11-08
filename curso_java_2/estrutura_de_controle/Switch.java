package estrutura_de_controle;

public class Switch {
    public static void main(String[] args) {
        int idade = 3;

        switch(idade)
        {
            case 3:
                System.out.println("Sabe falar");
            case 2:
                System.out.println("Sabe andar");
            case 1:
                System.out.println("tem conciencia");
                break;
            default:
                System.out.println("ta para nascer");
        }
    }
}
