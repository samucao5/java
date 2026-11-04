package annotations;

public class Cachorro extends Animais{
    
    @Override 
    public void emitirSom()
    {
        System.out.println("O cachorro esta emitindo som");
    }

    //Warning não para a compilação 
    //erro (vermelho) não compila
    @SuppressWarnings("Deprecation")
    public void testeMover()
    {
        mover();
    }
}
