package Arrays_e_collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) {
        Deque<String> livros = new ArrayDeque<>();
        //Deque -> o ultimo que entrou na pilha e o primeiro a sair
        //Queue -> o primeiro a entrar e o primeiro a sair
        livros.add("o pequeno principe");
        livros.push("eleanor & park");
        livros.push("O hobbit");
        for (String livro : livros)
            {
                System.out.println(">>>" + livro);
            }

        System.out.println(livros.peek());
        System.out.println(livros.poll());
        System.out.println(livros.poll());
        System.out.println(livros.pop()); // faz a mesma coisa que o remove e o poll, porem ele igual ao remove retorna uma exceção quando esta vazio
        System.out.println(livros.poll());

    }
}
