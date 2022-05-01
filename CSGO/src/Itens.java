
public class Itens {

    private String nome;
    private String municao;
    private String lado;
    private String desc;
    
    public Itens(String nome, String municao, String lado ,String desc){
        this.nome = nome;
        this.municao = municao;
        this.lado = lado;
        this.desc = desc;
    }
    
    public void imprimir_item(){
        System.out.println("");
        System.out.println("Nome do item: " + this.nome);
        System.out.println("Municao: " + this.municao);
        System.out.println("Lado: " + this.lado);
        System.out.println("Descrição: " + this.desc);
        System.out.println("");
        System.out.println("");
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public String getMunicao() {
        return municao;
    }

    public void setMunicao(String municao) {
        this.municao = municao;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getLado() {
        return lado;
    }

    public void setLado(String lado) {
        this.lado = lado;
    }
    
}
