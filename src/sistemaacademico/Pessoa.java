package sistemaacademico;

public abstract class Pessoa {
    private String nome;
    private String cpf;
    private String email;

    public Pessoa(String nome, String cpf, String email){
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    public void exibirDados(){
        System.out.printf("Nome: %s\n", getNome());
        System.out.printf("Cpf: %s\n", getCpf());
        System.out.printf("Email: %s\n", getEmail());
    }

    public String getNome(){
        return nome;
    }
    public String getCpf(){
        return cpf;
    }
    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }
}
