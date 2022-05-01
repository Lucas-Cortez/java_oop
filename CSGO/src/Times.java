
import java.util.ArrayList;

public class Times {
    private String nome;
    private int rank;
    private ArrayList<Jogadores> listaJogadores = new ArrayList();
    
    public Times(String nome, int rank, ArrayList<Jogadores> listaJogadores){
        this.nome = nome;
        this.rank = rank;
        this.listaJogadores = listaJogadores;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
    
    public void imprimir_jogadores() {		
		
		/*for(int i = 0; i < this.listaJogadores.size(); i++) {
			System.out.println(this.listaJogadores.get(i).getNome());
		}*/
		      System.out.println("Jogadores do " + this.nome + ": ");
                      System.out.println("");
                      System.out.println("----------------");
		int tamanho_lista = this.listaJogadores.size();
		Jogadores j;
		for(int i = 0; i < tamanho_lista; i++) {
			j = this.listaJogadores.get(i);
			System.out.println("Nome: " + j.getNome());
                        System.out.println("Idade: " + j.getNick());
                        System.out.println("Salario: " + j.getSalario());
                        System.out.println("----------------");
		}		
                System.out.println("");
                System.out.println("");
                System.out.println("");
	}
}


