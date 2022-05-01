public class Pokemon {
    private String Nome;
    private String Tipo;
    private String Habilidade;
    private int Vida;

    public Pokemon(String Nome, String Tipo, String Habilidade, int Vida) {
        this.Nome = Nome;
        this.Tipo = Tipo;
        this.Habilidade = Habilidade;
        this.Vida = Vida;
    }

    public void executarhabilidade() {
        System.out.println("Executando a habilidade");
    }
}
