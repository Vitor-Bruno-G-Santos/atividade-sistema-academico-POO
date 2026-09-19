package sistemaacademico;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Turma {
    private String codigo;
    private Disciplina disciplina;
    private Professor professor;
    private List<Aluno> alunos = new ArrayList<>();
    private List<Nota> notas = new ArrayList<>();


    public Turma(Disciplina disciplina, Professor professor) {
        codigo = String.valueOf(gerarMatricula());
        this.disciplina = disciplina;
        this.professor = professor;
    }
    private static int gerarMatricula(){
        Random random = new Random();
        return random.nextInt(10000);
    }
    public Disciplina getDisciplina() {
        return disciplina;
    }

    public Professor getProfessor() {
        return professor;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public List<Nota> getNotas() {
        return notas;
    }

    public void adicionarAluno(Aluno aluno){
        alunos.add(aluno);
    }
    public void removerAluno(Aluno aluno){
        alunos.remove(aluno);
    }

    public void adicionarNota(Nota nota){
        notas.add(nota);
    }

    public void listarAlunos(){
        System.out.println("===== ALUNOS NA TURMA =====");
        for(Aluno aluno : alunos){
            System.out.println(aluno.getNome());
        }
    }
    public void listarNotas(){
        System.out.println("===== NOTAS DA TURMA =====");
        for (Nota nota : notas){
            System.out.printf("Aluno: %s\nNota: %f\nDescricao: %s\n", nota.getAluno().getNome(), nota.getValor(), nota.getDescricao());
        }
    }
}
