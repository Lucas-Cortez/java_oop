package diegobanco;
public class DiegoBanco {
    public static void main(String[] args) {
        // CODE 
        Cliente cliente1 = new Cliente("Percy Jackson", "857.996.452-13", "23-08-2000", 800f, "CC");
        Cliente cliente2 = new Cliente("Nick Bell", "147.558.966-45", "23-01-2001", 985.25f, "CC");
        Cliente cliente3 = new Cliente("Raphael Goldberg", "753.159.456-89", "04-06-2002", 740.90f, "CP");
        Cliente cliente4 = new Cliente("Ronan Lynch", "632.415.458-12", "08-07-2000", 21450f, "CC");
        
        Funcionario atendente1 = new Funcionario("Simon Snow", "789.456.987-45", "27-10-1995", 1300f, 1);
        Funcionario atendente2 = new Funcionario("Henry Denton", "354.785.985-12", "17-05-1998", 1400f, 2);
        
        Funcionario gerente1 = new Funcionario("Aled Last", "852.951.753-85", "12-11-1994", 3200f, 1, "univercidade42");
        Funcionario gerente2 = new Funcionario("Ben Carver", "753.865.954-75", "11-01-2001", 2850f, 2, "rafegoldb25");
        
        System.out.println("Imprimindo todos os clientes cadastrados: ");
        cliente1.status();
        cliente2.status();
        cliente3.status();
        cliente4.status();
        
        System.out.println("Imprimindo todos os atendentes cadastrados: ");
        atendente1.status();
        atendente2.status();
        
        System.out.println("Imprimindo todos os gerentes cadastrados: ");
        gerente1.status();
        gerente2.status();
        
        System.out.println("Cliente com saldo tentando fechar a conta: ");
        cliente1.fecharConta();
        System.out.println("\nConta não pode ser fechada pois tem saldo. Vamos verificar quanto: ");
        cliente1.consultaSaldo();
        System.out.println("\nVamos retirar o saldo para fechar a conta: ");
        cliente1.conta.sacar(800f);
        System.out.println("\nSem dinheiro, a conta pode ser fechada: ");
        cliente1.fecharConta();
        System.out.println("\nCom a conta fechada, o cliente não pode realizar nenhuma transação: ");
        System.out.println("Depositando: ");
        cliente1.conta.depositar(10f);
        System.out.println("Sacando: ");
        cliente1.conta.sacar(800f);
        System.out.println("Consultando saldo: ");
        cliente1.consultaSaldo();
        
        System.out.println("\nVamos reabrir a conta e fazer operações: ");
        cliente1.abrirConta();
        cliente1.consultaSaldo();
        cliente1.conta.depositar(1400f);
        cliente1.conta.sacar(100f);
        System.out.println("\nSacando um valor acima do saldo: ");
        cliente1.conta.sacar(1500f);
    }
}