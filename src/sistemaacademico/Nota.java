package sistemaacademico;

public class Nota {
    private Aluno aluno;
    private double valor;
    private String descricao;

    public Nota(Aluno aluno, double valor, String descricao){
        this.aluno = aluno;
        this.valor = valor;
        this.descricao = descricao;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public Double getValor() {
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
    public void exibirNota(){
        System.out.printf("Nota: %f\n", getValor());
        System.out.printf("Descrição: %s\n", getDescricao());
    }
}
