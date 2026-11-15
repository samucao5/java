package Arrays_e_collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        //fila(queue)
        Queue<String> fila = new LinkedList<>();

        //Offer e Add -> adicionam elementos na fila
        //diferença e o comportamento quando a fila esta cheia
        //quando a fila esta cheia
        fila.add("Samuel");//.add() lançará uma exceção caso a fila esteja cheia.
        fila.offer("Yasmin"); //.offer() retorna falso caso a fila esteja cheia.
        fila.add("Beatriz");
        fila.offer("Ana");
        fila.add("Maria");
        fila.offer("Pietra");

        //Peek e Element -> obter o proximo elementos
        //da fila (sem remover)

        //diferente e o comportamento ocorre quando a fila esta vazia
        System.out.println(fila.peek());//retorna false
        System.out.println(fila.element());//lança uma exceção

        //poll e Remove -> obter o proximo elementos
        //da fila e remove

        //diferente e o comportamento ocorre quando a fila esta vazia
        System.out.println(fila.poll());//retorna falso, caso esteja vazia
        System.out.println(fila.remove());//lança uma exceção, caso esteja vazia
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());

        //fila.size(): saber o tamanho da fila
        //fila.clear(): limpar a fila
        //fila.isEmpty(): verificar se esta vazia
        //fila.contains()
    }
}
