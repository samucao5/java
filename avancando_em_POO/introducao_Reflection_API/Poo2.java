package avancando;
import java.lang.reflect.*;

public class Poo2 {
    public static void main(String[] args) {
        //classe com final

        ContaBancaria conta = new ContaBancaria(255);

        System.out.println("saldo: R$" + conta.getSaldo());

        //classe final - não pode  ser herdada 
        // metodo final - não pode ser sobrescrito
        try
        {
            Class <?> classePessoa = Class.forName("avancando.Pessoa");

            Constructor<?> construtor = classePessoa.getConstructor(String.class, int.class);

            Object pessoa = construtor.newInstance("samuel", 20);

            Method metodoDizerOla = classePessoa.getMethod("dizerOla");

            metodoDizerOla.invoke(pessoa);

            Field campoNome = classePessoa.getDeclaredField("nome");

            campoNome.setAccessible(true);

            campoNome.set(pessoa, "Yasmin");

            metodoDizerOla.invoke(pessoa);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        
    }
}
