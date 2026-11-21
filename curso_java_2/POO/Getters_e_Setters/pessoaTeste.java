package Poo;

public class pessoaTeste {
    public static void main(String[] args)
    {
        Pessoa p1 = new Pessoa("Pedro", "Batista",20);
        //p1.idade = -20; alterar
        //System.out.println("Idade: " + p1.idade); ler
        p1.setNome("Samuel");
        p1.setSobrenome("Felipe");
        p1.setIdade(21);
        System.out.println(p1.getIdade());
        System.out.println(p1.getNome());
        System.out.println(p1.getSobrenome());
        System.out.println(p1); //toString

    }

}
