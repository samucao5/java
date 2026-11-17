package Poo;

public class CursoTeste {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Samuel");
        Aluno aluno2 = new Aluno("Pedro");
        Aluno aluno3 = new Aluno("Allan");

        Curso curso1 = new Curso("matematica");
        Curso curso2 = new Curso("Programação");
        Curso curso3 = new Curso("automação industria");

        curso1.adicionarAluno(aluno2);
        curso2.adicionarAluno(aluno1);
        curso3.adicionarAluno(aluno2);

        curso3.adicionarAluno(aluno3);
        curso2.adicionarAluno(aluno3);

        curso1.matricula();

        curso2.matricula();

        curso3.matricula();

        Curso cursoEncontrado = aluno1.obterCursoPorNome("programação");

        if (cursoEncontrado != null)
            {
                System.out.println(cursoEncontrado.nome);
                System.out.println(cursoEncontrado.alunos);
            }
    }
}
