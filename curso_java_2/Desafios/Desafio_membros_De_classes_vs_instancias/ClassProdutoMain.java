package Desafios.Desafio_membros_De_classes_vs_instancias;

public class ClassProdutoMain {
    public static void main(String[] args) {
        
    ClassProduto produto = new ClassProduto("camisa verde", 25.3);
    produto.exibir_nota();

    ClassProduto produto2 = new ClassProduto("laranja", 5, 0.30);
    produto2.exibir_nota();

    }
}
