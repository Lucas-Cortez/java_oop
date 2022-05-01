public class Estadio {
    private String nomeEstadio;
    private String local;
    private String time;


    public Estadio(String nomeEstadio, String local, String time) {
        this.nomeEstadio = nomeEstadio;
        this.local = local;
        this.time = time;  
    }

    public void apresentaEstadio() {
        System.out.println("Nome do estádio: " + this.nomeEstadio);
        System.out.println("Local: " + this.local);
        System.out.println("Time: " + this.time);
    }
}
