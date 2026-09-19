import sistemaacademico.*;

public class Main {
    public static void main(String[] args) {
        Professor professor = new Professor("Caique", "981.981.981-98", "caique@gmail.com");
        Disciplina disciplina =  professor.cadastrarDisciplina("Java", 4);
        Turma turma = professor.criarTurma(disciplina);
        Aluno aluno1 = professor.cadastrarAluno("Jorgim", "676.767.676-67", "jorjo@gmail.com", turma);
        Aluno aluno2 = professor.cadastrarAluno("Jorginha", "676.762.676-67", "jorja@gmail.com", turma);
        Aluno aluno3 = professor.cadastrarAluno("Arvoro", "676.767.676-65", "arvri@gmail.com", turma);
        turma.listarAlunos();
        Nota nota1Aluno1 = professor.lancarNota(aluno1, 9.1, "Tu é mt brabo mano");
        Nota nota2Aluno1 = professor.lancarNota(aluno1, 1.2, "Tu ta de sacanagem né");
        Nota nota1Aluno2 = professor.lancarNota(aluno2, 3, "Melhora fio");
        Nota nota2Aluno2 = professor.lancarNota(aluno2, 9, "Go drinking");
        Nota nota1Aluno3 = professor.lancarNota(aluno3, 10, "Brabo dms");
        Nota nota2Aluno3 = professor.lancarNota(aluno3, 9, "FAAAAH");
        turma.adicionarNota(nota1Aluno1);
        turma.adicionarNota(nota2Aluno1);
        turma.adicionarNota(nota1Aluno2);
        turma.adicionarNota(nota2Aluno2);
        turma.adicionarNota(nota1Aluno3);
        turma.adicionarNota(nota2Aluno3);
        turma.listarNotas();
        aluno1.consultarNotas(turma.getNotas());
        aluno2.consultarTurmas();



    }
}