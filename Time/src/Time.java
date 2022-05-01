import java.util.ArrayList;

public class Time {
    private String time;
    private ArrayList<Jogador> jogadores = new ArrayList();
    private Tecnico tecnico;
    private Presidente presidente;
    private Estadio estadio;

    public void adicionarJogador(Jogador jogador) {
        jogadores.add(jogador);
    }
}
