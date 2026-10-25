package POO;
import java.util.Arrays;

public class turma {
    private String[] alunos;

    public turma(String[] alunos)
    {
        this.alunos = Arrays.copyOf(alunos, alunos.length);
    }

    public void setAlunos(String[] alunos)
    {
        if(alunos.length > 0)
            {
                this.alunos = Arrays.copyOf(alunos, alunos.length);
            }
    }

    public String[] getAlunos() 
    {
        return Arrays.copyOf(alunos, alunos.length);
    }
}
