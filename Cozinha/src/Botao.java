public class Botao {
    private String materialBotao;
    private String corBotaoString;

    public Botao(String materialBotao, String corBotaoString) {
        this.materialBotao = materialBotao;
        this.corBotaoString = corBotaoString;
    }

    public void imprimeTudo() {
        System.out.println(this.materialBotao);
        System.out.println(this.corBotaoString);
    }
}