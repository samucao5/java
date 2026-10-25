package POO;

public class Livros {

    private String titulo;
    private String autor;
    private double preco;

    
    //fallback
    //caso o outro não de certo, este se torna o verdadeiro
    public Livros()
    {
        this.titulo = "titulo base";
        this.autor = "autor base";
        this.preco = 0.00;
    }
    
    //override
    public Livros(String titulo, String autor, double preco)
    {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    public void ExibirInfoLivro()
    {
        System.out.println("Titulo: " + titulo + "\nAutor: " + autor + "\nPreco: R$ " + preco);
    }
    
}
