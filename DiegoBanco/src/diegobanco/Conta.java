package diegobanco;
public class Conta {
    //Atributos
    private boolean ativa;
    private float saldo;
    private String tipoConta;
    
    //Métodos    
    public void sacar(float valor) {
        if (this.isAtiva()) {
            if (valor <= this.saldo) {
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Você sacou " + valor);
                System.out.println("Seu saldo agora é " + this.getSaldo());
            } else
                System.out.println("[!] Você não possui saldo suficiente para fazer esta operação!");
        } else {
            System.out.println("[!] Esta ação só pode ser realizada por contas ativas.");
        }
    }
    
    public void depositar(float valor) {
        if (this.isAtiva()) {
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Você depositou " + valor);
            System.out.println("Seu saldo agora é " + this.getSaldo() );
        } else {
            System.out.println("[!] Sua conta não está ativa.");
        }
    }
    
    //Métodos Especiais
    public Conta(float saldo, String tipoConta) {
        this.ativa = true;
        this.saldo = saldo;
        this.tipoConta = tipoConta;
    }
    
    public boolean isAtiva() {
        return ativa;
    }

    protected void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public float getSaldo() {
        return saldo;
    }

    private void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }
}