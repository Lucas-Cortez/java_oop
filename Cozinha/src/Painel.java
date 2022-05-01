import java.util.ArrayList;

public class Painel {
    private int qtdBotoes;
    private String cor;
    private ArrayList<Botao> listaBotoes = new ArrayList();

    public Painel(int qnt, String cor, String corB, String MBotao) {
        this.cor = cor;
        this.qtdBotoes = qnt;
        for(int i = 0; i < qnt; i++) {
            Botao b = new Botao(corB, MBotao);
            this.listaBotoes.add(b);
        }
    }

    public void imprimeTudo() {
        System.out.println(this.cor);
        
        for(int i = 0; i < this.qtdBotoes; i++) {
            Botao b = this.listaBotoes.get(i);
            b.imprimeTudo();
        }
    }
}
