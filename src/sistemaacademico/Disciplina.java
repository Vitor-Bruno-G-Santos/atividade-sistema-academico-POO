package sistemaacademico;

import java.util.Random;

public class Disciplina {
    private String codigo;
    private String nome;
    private int cargaHoraria;

    public Disciplina(String nome, int cargaHoraria){
        codigo = String.valueOf(gerarCodigo());
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
    }
    private static int gerarCodigo(){
        Random random = new Random();
        return random.nextInt(10000);
    }


    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void exibirDados(){
        System.out.printf("Codigo: %s\n", getCodigo());
        System.out.printf("Nome: %s\n", getNome());
        System.out.printf("Carga Horária: %s\n", getCargaHoraria());
    }
}
