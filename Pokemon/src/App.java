public class App {
    public static void main(String[] args) throws Exception {
        Pokemon pikachu = new Pokemon(); // pikachu eh um objeto de pokemon
		
		//pikachu.nome = "Pikachu";
		pikachu.setNome("Pikachu");
		//pikachu.tipo = "El�trico";
		pikachu.setTipo("El�trico");
		//pikachu.habilidade = "Choque do Trov�o";
		pikachu.setHabilidade("Choque do Trov�o");
		
			
		pikachu.imprimir();
		pikachu.atacar();
		//String nome = pikachu.getNome();
		System.out.println(pikachu.getNome());
		
		Pokemon squirtle = new Pokemon();
		squirtle.setNome("Squirtle");
		//squirtle.nome = "Squirtle";
		squirtle.setTipo("Aqu�tico");
		//squirtle.tipo = "Aqu�tico";
		squirtle.setHabilidade("Jato de �gua");
		//squirtle.habilidade = "Jato de �gua";
		
		squirtle.imprimir();
		squirtle.atacar();
    }
}
