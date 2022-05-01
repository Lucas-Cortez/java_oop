package diegobanco;
public class Cliente extends Pessoa{    //A classe Cliente é uma herança da clase Pessoa
    //Atributos
    protected Conta conta;
    
    //Métodos
    public void fecharConta() {
        if ( this.conta.getSaldo() != 0.0 )
            System.out.println("[!] Você deve sacar todo o dinheiro de sua conta para poder fechar a conta!");
        else {
            this.conta.setAtiva(false);
            System.out.println("Sua conta foi fechada.");
        }
    }
    
    public void abrirConta() {
        if (this.conta.isAtiva()) {
            System.out.println("[!] Sua conta já está ativa!");
        } else {
            this.conta.setAtiva(true);
            System.out.println("Sua conta foi reaberta e está pronta para fazer transações.");
        }
    }
    
    public void consultaSaldo() {
        if (this.conta.isAtiva())
            System.out.println("O saldo da conta é de " + this.getNome() + " é "+ this.conta.getSaldo() );
        else
            System.out.println("[!] Sua conta não está ativa.");
    }
    
    @Override
    public void status() {
        super.status();
        System.out.println("Tipo: Cliente");
        System.out.println("Conta Ativa: " + this.conta.isAtiva());
        System.out.println("Tipo Conta: " + this.conta.getTipoConta());
        System.out.println("Saldo: " + this.conta.getSaldo() );
        System.out.println("");
    }   //Sobreposição do método Status da classe Pessoa que une os atributos de Pessoa com os de Cliente.
    
    //Métodos Especiais
    public Cliente(String nome, String cpf, String nascimento, float saldo, String tipoConta) {
        this.setNome(nome);
        this.setCpf(cpf);
        this.setNascimento(nascimento);
        this.conta = new Conta(saldo, tipoConta);
    }   //Construtor da classe Cliente, que por sua vez dá origem à uma Conta, encaminhando 
        //os dados ao construtor da classe Conta, gerando uma relação de composição.
}