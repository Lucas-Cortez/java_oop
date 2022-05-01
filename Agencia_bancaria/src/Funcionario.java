public class Funcionario {
    private String cargo;
    private String nome;
    private String cpf;
    private int salario;
    private String senha;
    private int qntFuncionarios = 0;
    private int qntGerentes = 0;
    private boolean acesso_relatorio = false;

    public Funcionario(String nome, String cpf, int salario) {
        this.cargo = "FUNC";
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }
    
    public Funcionario(String nome, String cpf, int salario, String senha, int qntFuncionarios) {
        this.cargo = "GERE";
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.senha = senha;
        this.qntFuncionarios = qntFuncionarios;
    }

    public Funcionario(String nome, String cpf, int salario, int qntGerentes) {
        this.cargo = "DIRE";
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.qntGerentes = qntGerentes;
        this.acesso_relatorio = true;
    }

    public void getFuncionario() {
        if(this.cargo == "FUNC") {
            System.out.println("Nome: " + this.nome);
            System.out.println("CPF: " + this.cpf);
            System.out.println("Salário: " + this.salario);
            System.out.println("Ao fim do ano receberá bonificação de R$" + this.salario * 0.1);
        } else {
            System.out.println("Funcionário não possui este cargo");
        }
    }

    public void getGerente() {
        if(this.cargo == "GERE") {
            System.out.println("Nome: " + this.nome);
            System.out.println("CPF: " + this.cpf);
            System.out.println("Salário: " + this.salario);
            System.out.println("Senha: " + this.senha);
            System.out.println("Funcionários gerenciados: " + this.qntFuncionarios);
            System.out.println("Ao fim do ano receberá bonificação de R$" + this.salario * 0.15);
        } else {
            System.out.println("Funcionário não possui este cargo");
        }
    }

    public void getDiretor() {
        if(this.cargo == "DIRE") {
            System.out.println("Nome: " + this.nome);
            System.out.println("CPF: " + this.cpf);
            System.out.println("Salário: " + this.salario);
            System.out.println("Gerentes gerenciados: " + this.qntFuncionarios);
            System.out.println("Possui acesso aos relátórios");
            System.out.println("Ao fim do ano receberá bonificação de R$" + this.salario * 0.2);
        } else {
            System.out.println("Funcionário não possui este cargo");
        }
    }


    
}
 