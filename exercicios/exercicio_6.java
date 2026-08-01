import java.util.*;

public class exercicio_6 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        char letra;
        String resultado;
        System.out.println("digite uma letra: ");
        letra = scanner.next().toLowerCase().charAt((0));

        switch(letra)
        {
            case 'a':
                resultado = "vogal";
                break;
            case 'e':
                resultado = "vogal";
                break;
            case 'i':
                resultado = "vogal";
                break;
            case 'o':
                resultado = "vogal";
                break;
            case 'u':
                resultado = "vogal";
                break;
            default:
                resultado = "consoante";
                break;
        }

        System.out.println("esta letra e uma " + resultado);

    }
}
