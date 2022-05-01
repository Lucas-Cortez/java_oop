import java.util.Date;

public class Proprietario {
    private String Nome;
    private int CPF;
    private int RG;
    private Date Data_de_Nascimento = new Date();
    private Endereço Endereço;

    public Proprietario(String Nome, int CPF, int RG) {
        this.Nome = Nome;
        this.CPF = CPF;
        this.RG = RG;
    }

    public void getNome(String Nome) {
        this.Nome = Nome;
    }
    public void setNome() {
        System.out.println(this.Nome);
    }

    public void getCPF(int CPF) {
        this.CPF = CPF;
    }
    public void setCPF() {
        System.out.println(this.CPF);
    }

    public void getRG(int RG) {
        this.RG = RG;
    }
    public void setRG() {
        System.out.println(this.RG);
    }

    public void getData_de_Nascimento(Date Data_de_Nascimento) {
        this.Data_de_Nascimento = Data_de_Nascimento;
    }
    public void setData_de_Nascimento() {
        System.out.println(this.Data_de_Nascimento);
    }
}