public class Aluno {
    private int ra;
    private String nome;
    private boolean matriculado;

    public Aluno(int ra, String nome, boolean matriculado) {
        this.ra = ra;
        this.nome = nome;
        this.matriculado = matriculado;
    }

    public void imprimir() {
        System.out.println(ra);
        System.out.println(nome);
        System.out.println(matriculado);
    }
}
