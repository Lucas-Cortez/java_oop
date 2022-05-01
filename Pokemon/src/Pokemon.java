// package exemplos;

public class Pokemon {

	// Atributos 
	private String nome;
	private String tipo;
	private String habilidade;
	
	// m�todos getters e setters
	public void setNome(String n) {
		nome = n;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setTipo(String t) {
		tipo = t;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setHabilidade(String h) {
		habilidade = h;
	}
	
	public String getHabilidade() {
		return habilidade;
	}
	
	// m�todo
	public void imprimir() {
		System.out.println("Nome = " + nome + " Tipo = " + tipo);
	}
	
	public void atacar() {
		System.out.println("O pokemon " + nome + " atacou com " + habilidade);
	}
	
}
