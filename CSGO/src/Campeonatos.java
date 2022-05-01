
import java.util.ArrayList;

public class Campeonatos {
    
    private String nome;
    private int premiacao;
    private ArrayList<Partidas> listaPartidas = new ArrayList();
    private ArrayList<Times> listaTimes = new ArrayList();

    public Campeonatos(String nome, int premiacao, ArrayList<Partidas> listaPartidas, ArrayList<Times> listaTimes){
        this.nome = nome;
        this.premiacao = premiacao;
        this.listaPartidas = listaPartidas;
        this.listaTimes = listaTimes;
    }
    
    public void imprimir_campeonato(){
        
                System.out.println("Nome: " + this.nome);
                System.out.println("");
                System.out.println("--------------------");
                System.out.println("Times participantes:");
                System.out.println("--------------------");
        
        int tamanho_lista = this.listaTimes.size();
		Times j;
                
		for(int i = 0; i < tamanho_lista; i++) {
			j = this.listaTimes.get(i);
			System.out.println(j.getNome());
		}
                
                System.out.println("Premiacao: " + this.premiacao);
                System.out.println("");
                System.out.println("");
                
        int tamanho_listap = this.listaPartidas.size();
                System.out.println("-----------------------");
                System.out.println("Partidas do campeonato:");
                System.out.println("-----------------------");
		Partidas p;
                
		for(int i = 0; i < tamanho_listap; i++) {
			p = this.listaPartidas.get(i);
                        System.out.println("Vencedor: " + p.getVencedor());
                        System.out.println("Perdedor: " + p.getPerdedor());
			System.out.println("Total de rounds: " + p.getRoundsTotais());
                        System.out.println("Primeiro Half: " + p.getPrimeiroHalf());
                        System.out.println("Segundo Half: " + p.getSegundoHalf());
                        System.out.println("");
                        System.out.println("");
                        
		}
                
        
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPremiacao() {
        return premiacao;
    }

    public void setPremiacao(int premiacao) {
        this.premiacao = premiacao;
    }
    
    
}
