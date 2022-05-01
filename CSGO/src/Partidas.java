
public class Partidas {

    private int roundsTotais;
    private String vencedor;
    private String perdedor;
    private String primeiroHalf;
    private String segundoHalf;
    
    public Partidas(int roundsTotais, String vencedor, String perdedor, String primeiroHalf, String segundoHalf){
        this.roundsTotais = roundsTotais;
        this.vencedor = vencedor;
        this.perdedor = perdedor;
        this.primeiroHalf = primeiroHalf;
        this.segundoHalf = segundoHalf;
    }
    
    public int getRoundsTotais() {
        return roundsTotais;
    }

    public void setRoundsTotais(int roundsTotais) {
        this.roundsTotais = roundsTotais;
    }

    public String getVencedor() {
        return vencedor;
    }

    public void setVencedor(String vencedor) {
        this.vencedor = vencedor;
    }

    public String getPrimeiroHalf() {
        return primeiroHalf;
    }

    public void setPrimeiroHalf(String primeiroHalf) {
        this.primeiroHalf = primeiroHalf;
    }

    public String getSegundoHalf() {
        return segundoHalf;
    }

    public void setSegundoHalf(String segundoHalf) {
        this.segundoHalf = segundoHalf;
    }

    public String getPerdedor() {
        return perdedor;
    }

    public void setPerdedor(String perdedor) {
        this.perdedor = perdedor;
    }
    
    
}
