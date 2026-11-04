package annotations;

public class Animais {
    
    public void emitirSom()
    {
        System.out.println("o animal esta emitindo som");
    }

    //restringir o acesso 
    @Deprecated 
    public void mover()
    {
        System.out.println("O animal esta se movendo");
    }
}
