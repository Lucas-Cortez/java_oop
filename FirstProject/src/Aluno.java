public class Aluno {

    private String Nome;
    private Double N1;
    private Double N2;
    private Integer Freq;
    private Double Media;

    public void situAluno() {
        Media = N1+N2/2;

        if (Freq < 75) {
            System.out.println("Reprovado por faltas");
        } else if (Media >= 5 && Freq > 75) {
            System.out.println("Aprovado");
        } else if (Media >= 3 && Freq > 75) {
            System.out.println("RE");
        } else {
            System.out.println("Reprovado");
        }
    }

    public void setNome(String n) {
        Nome = n;
    }
    public void getNome() {
        System.out.println(Nome);
    }

    public void setN1(Double n) {
        N1 = n;
    }
    public void getN1() {
        System.out.println(N1);

    }

    public void setN2(Double n) {
        N2 = n;
    }
    public void getN2() {
        System.out.println(N2);
    }

    public void setFreq(Integer n) {
        Freq = n;
    }
    public void getFreq() {
        System.out.println(Freq);
    }

    public void getMedia() {
        Media = N1+N2/2;
        System.out.println(Media);
    }
    



}
