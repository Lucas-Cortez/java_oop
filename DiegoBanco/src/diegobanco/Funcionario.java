package diegobanco;
public class Funcionario extends Pessoa{    //A classe Funcionário é uma herança da clase Pessoa
    //Atributos
    private final String cargo; //Cargo é uma variável final pois nunca será alterada.
    private float salario;
    private int superior;
    private int idGerente;
    private String senha;
    
    //Métodos
    @Override
    public void status() {
        super.status();
        System.out.println("Tipo: Funcionário");
        System.out.println("Cargo: " + this.cargo);
        System.out.println("Salário: " + this.salario);
        if (this.cargo.equals("atendente")) {
            System.out.println("ID do Chefe: " +  this.superior);
        } else {
            System.out.println("ID: " + this.idGerente);
            System.out.println("Senha de sistema: " + this.senha);
        }
        System.out.println("");
    }   //Sobreposição do método Status da classe Pessoa que une os atributos 
        //de Pessoa com os dos Funcionários.
    
    //Métodos Especiais
    public Funcionario(String nome, String cpf, String nascimento, float salario, int superior) {
        this.setNome(nome);
        this.setCpf(cpf);
        this.setNascimento(nascimento);        
        this.cargo = "atendente";
        this.salario = salario;
        this.superior = superior;
    }   //Primeiro construtor da classe Funcionário, que serve para atribuir 
        //funcionários ao cargo atendente, que é atributo final e nunca deve mudar.

    public Funcionario(String nome, String cpf, String nascimento, float salario, int idGerente, String senha) {
        this.setNome(nome);
        this.setCpf(cpf);
        this.setNascimento(nascimento);
        this.cargo = "gerente";
        this.salario = salario;
        this.idGerente = idGerente;
        this.senha = senha;
    }   //Segundo construtor da classe Funcionário, que serve para atribuir 
        //funcionários ao cargo gerente, que é atributo final e nunca deve mudar.

    public String getCargo() {
        return cargo;
    }

    public float getSalario() {
        return salario;
    }

    protected void setSalario(float salario) {
        this.salario = salario;
    }

    public int getSuperior() {
        return superior;
    }

    protected void setSuperior(int superior) {
        this.superior = superior;
    }

    public int getIdGerente() {
        return idGerente;
    }

    protected void setIdGerente(int idGerente) {
        this.idGerente = idGerente;
    }
}