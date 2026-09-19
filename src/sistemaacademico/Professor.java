package sistemaacademico;

import java.util.Random;

public class Professor extends Pessoa{

    private String registro;

    public Professor(String nome, String cpf, String email) {

        super(nome, cpf, email);
        registro = String.valueOf(gerarRegistro());

    }
     private static int gerarRegistro(){
        Random random = new Random();
        return random.nextInt(10000);
     }

    public String getRegistro() {
        return registro;
    }

    public Aluno cadastrarAluno(String nome, String cpf, String email, Turma turma){
        return new Aluno(nome, cpf, email, turma);
    }
    public Disciplina cadastrarDisciplina(String nome, int cargaHoraria){
        return new Disciplina(nome, cargaHoraria);
    }
    public Turma criarTurma(Disciplina disciplina){
        return new Turma(disciplina, this);
    }
    public Nota lancarNota(Aluno aluno, double valor, String descricao){
        if(valor >= 0 && valor <= 10)  return new Nota(aluno, valor, descricao);
        System.out.println("Nota invalida");
        return null;
    }

    public void exibirDados(){
        System.out.printf("Registro: %s", registro);
        super.exibirDados();

    }


}

