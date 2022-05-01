public class Jogador {
    private String nome;
    private int numero;

    public Jogador(String nome, int num) {
        this.nome = nome;
        this.numero = num;
    }

    public void apresentaJogador() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Número: " + this.numero);
    }
    
}
