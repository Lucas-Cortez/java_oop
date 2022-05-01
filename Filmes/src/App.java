import java.text.SimpleDateFormat;
import java.util.Date;

public class App {
    public static void main(String[] args) throws Exception {

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
        Date date = formato.parse("23/11/2015");

        Ator ator1 = new Ator("João");
        ator1.getNome();
        System.out.println("----------------------------------------");

        Filme Constantine = new Filme("Constantine", date, "Crítica especializada", "Envolvente", ator1);
        Filme Titanic = new Filme("Titanic", date, "Crítica especializada", "Envolvente");

        Titanic.getFilme();
        System.out.println("----------------------------------------");
        Constantine.getFilme();
    }
}
