package annotations;

public class Diretivas_predefinidas {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.emitirSom();
        cachorro.testeMover();


        // annotation customizada
        Exemplo exemplo = new Exemplo();

        //anotações geralmente vão precisar de try catch
            //loop em cada um dos metodos
            for(var metodo : exemplo.getClass().getDeclaredMethods())
                {
                    System.out.println(metodo);
                    //verifica se a anotação esta presente no método
                    if(metodo.isAnnotationPresent(Executar.class))
                        {
                            //resgatar qual e a annotation
                            Executar anotacao = metodo.getAnnotation(Executar.class);
                            
                            //loop baseado em quantas vezes tem que executar
                            for(int i = 0; i < anotacao.vezes(); i++)
                                {
                                    //invoco o metodo -> mostrarMensagem
                                    try 
                                    {
                                        metodo.invoke(exemplo);
                                    } 
                                    catch (Exception e)
                                    {
                                        System.out.println("Erro: " + e.getMessage());
                                    }
                                }

                        }
                }
        }

    }

