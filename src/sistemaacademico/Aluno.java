package sistemaacademico;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Aluno extends Pessoa{

    private String matricula;
    private List<Turma> turmas = new ArrayList<>();

    public Aluno(String nome, String cpf, String email, Turma turma) {
        super(nome, cpf, email);
        matricula = String.valueOf(gerarMatricula());
        turmas.add(turma);
        turma.adicionarAluno(this);
    }
    private static int gerarMatricula(){
        Random random = new Random();
        return random.nextInt(10000);
    }

    public String getMatricula() {
        return matricula;
    }

    public void consultarNotas(List<Nota> listaNotas){
        System.out.printf("===== NOTAS DO ALUNO %s =====\n", getNome());
        for(Nota nota : listaNotas){
            //Verifica se este objeto é igual ao objeto registrado na nota
            if(this == nota.getAluno()){
                nota.exibirNota();
            }
        }

    }
    public void consultarTurmas(){
        System.out.printf("===== TURMAS DO ALUNO %s ======\n", getNome());
        //Verifica se encontrou ou não a turma do aluno
        boolean encontrou = false;

        for(Turma turma : turmas){
            if(turma.getAlunos().contains(this)){
                System.out.printf("Está na turma da disciplina %s do Professor: %s", turma.getDisciplina().getNome(), turma.getProfessor().getNome());
                encontrou = true;
            }
        }

        if (!encontrou) System.out.println("Aluno está atualmente sem turma");

    }
}
