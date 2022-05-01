package diegobanco;
public abstract class Pessoa {
    //Atributos
    private String nome;
    private String cpf;
    private String nascimento;
    
    //Métodos
    public void status() {
        System.out.println("---- [STATUS] ----");
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Nascimento: " + this.nascimento);
    }   //O método Status fornece as informações gerais do usuário, sendo sobreposto nas devidas classes.
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }
    
}