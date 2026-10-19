
import java.util.Arrays;

public class reference_trap {
    //Reference trap ocorre quando duas variaveis apontam para o mesmo objeto na memoria, causando modificações não intencionais ao objeto original ao alterar a cópia
    //Ao copiar Arrays ou objetos, a nova variavel pode compartilhar a referencia ao mesmo espaço de memoria, em vez de criar uma nova instancia
    //Alterações em uma variavel refletem na outra, pois ambas referenciam o mesmo objeto



    public static void main(String[] args)
    {
        String[] fruta = {"maca", "banana", "limao", "laranja"};
        String[] fruta_copia = fruta;

        fruta_copia[0] = "tangerina";

        System.out.println(Arrays.toString(fruta));
        System.out.println(Arrays.toString(fruta_copia));

        //como evitar?
        String[] fruta_clone = fruta.clone();

        System.out.println(Arrays.toString(fruta_clone));

        fruta_clone[0] = "tomate";
        System.out.println(Arrays.toString(fruta_clone));
        System.out.println(Arrays.toString(fruta));
        
    }
}
