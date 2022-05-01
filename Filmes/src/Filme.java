import java.util.Date;

public class Filme {
    private String titulo;
    private Comentario comentario;
    private Ator ator;
    private boolean temAtor;

    public Filme(String titulo, Date date, String tipo_publicacao, String texto) {
        this.titulo = titulo;
        this.comentario = new Comentario(date, tipo_publicacao, texto);
        this.temAtor = false;
    }

    public Filme(String titulo, Date date, String tipo_publicacao, String texto, Ator ator) {
        this.titulo = titulo;
        this.comentario = new Comentario(date, tipo_publicacao, texto);
        this.ator = ator;
        this.temAtor = true;
    }

    public void getFilme() {
        System.out.println("Titulo do filme: " + this.titulo);
        comentario.getComentario();
        if(this.temAtor) {
            ator.getNome();
        }
    }
}