public class App {
    public static void main(String[] args) throws Exception {
        Funcionario Funcionario1 = new Funcionario("João", "400.234.542-43", 5000);
        Funcionario Gerente1 = new Funcionario("Jorge", "403.830.567-44", 10000, "jorge12345", 5);
        Funcionario Diretor1 = new Funcionario("Pedro", "407.235.643-44", 20000, 3);

        Funcionario1.getFuncionario();
        System.out.println("----------------------------------------");
        Funcionario1.getGerente();
        System.out.println("----------------------------------------");
        Gerente1.getGerente();
        System.out.println("----------------------------------------");
        Gerente1.getDiretor();
        System.out.println("----------------------------------------");
        Diretor1.getDiretor();
        System.out.println("----------------------------------------");
        Diretor1.getFuncionario();
    }
}
