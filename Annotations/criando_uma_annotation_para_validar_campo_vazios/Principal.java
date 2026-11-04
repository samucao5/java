package annotations;
import java.lang.reflect.Field;

public class Principal {
    public static void main(String[] args) {
        usuario Usuario = new usuario("Samuel","");

        validarCampos(Usuario);

        usuario Usuario_2 = new usuario("","");
        
        validarCampos(Usuario_2);

    }
    //funcao para validar campos anotados
    public static void validarCampos(Object objeto) throws IllegalArgumentException
    {
        // pegar a classe, pegar os campos e verificar se eles tem annotation 
        Class<?> classe = objeto.getClass();

        for(Field campo : classe.getDeclaredFields())
            {
                if(campo.isAnnotationPresent(NotEmpty.class))
                    {
                        //saber o valor de message de cada campo
                        NotEmpty anotacao = campo.getAnnotation(NotEmpty.class);

                        //ativar a acessibilidade do campo privado 
                        campo.setAccessible(true);

                        try
                        {
                        Object valor = campo.get(objeto);
                        
                        if(valor == null || valor.toString().isEmpty())
                            {
                                System.out.println(anotacao.message());
                            }
                        }
                        catch(Exception e)
                        {
                            System.out.println("Erro: " + e.getMessage());
                        }


                        //validar o campo
                        
                    }
            }
    }

}
