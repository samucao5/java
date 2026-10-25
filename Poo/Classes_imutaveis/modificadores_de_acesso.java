package POO;

public class modificadores_de_acesso {
    
    public static void main(String[] args)
    {
    
    // niveis de acesso
        funcionario funcionario_1 = new funcionario("samuel", 5654.43, "samuel555");

        funcionario_1.exibirDados();

        funcionario_1.nome = "pedro";
        funcionario_1.salario = 2342.12;
        //não consegue alterar pois esta privada
        //funcionario_1.senha = "epanenem5";

        funcionario_1.exibirDados();
        funcionario_1.aumentarSalario(5);

        if(funcionario_1.autenticar_senha("samuel555"))
            {
                System.out.println("o usuario entrou no sistema");
            }
        else
            {
                System.out.println("senha incorreta");
            }


        PessoaImutavel pessoa_unica = new PessoaImutavel("samuel", 20);
        
        System.out.println(pessoa_unica.getNome());
        System.out.println(pessoa_unica.getidade());
        //não deixa alterar por causa do final e por causa do private
        //pessoa_unica.nome = "teste";
    }
}
