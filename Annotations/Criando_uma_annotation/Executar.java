package annotations;
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME) // em tempo de execução 
@Target(ElementType.METHOD) // aplicada em metodos
@interface Executar
    {
        int vezes() default 1;
    }

