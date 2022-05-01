public class Fogao {
    private String modelo;
    private String cor;
    private Painel painel;

    public Fogao(String modelo, String cor, int qnt, String corP, String corB, String MBotao) {
        this.modelo = modelo;
        this.cor = cor;
        this.painel = new Painel(qnt, corP, corB, MBotao);
    }

    public void imprimeTudo() {
        System.out.println(this.modelo);
        System.out.println(this.cor);
        this.painel.imprimeTudo();
    }
}
