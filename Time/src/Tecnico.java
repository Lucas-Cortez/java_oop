public class Tecnico {
    private String nome;

    public Tecnico(String nome) {
        this.nome = nome;
    }

    public void apresentaTecnico() {
        System.out.println("Nome: " + this.nome);
    }
}
