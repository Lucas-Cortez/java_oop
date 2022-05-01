import java.text.SimpleDateFormat;
import java.util.Date;

public class Comentario {
    private Date data;
    private String tipo_publicacao;
    private String texto;

    public Comentario(Date date, String tipo_publicacao, String texto) {
        this.data = date;
        this.tipo_publicacao = tipo_publicacao;
        this.texto = texto;
    }

    public void getComentario() {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
        System.out.println("Data publicação: " + formato.format(this.data));
        System.out.println("Tipo de publicação: " + this.tipo_publicacao);
        System.out.println("Texto: " + this.texto);
    }
}
