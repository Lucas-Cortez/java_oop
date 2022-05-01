
import java.util.ArrayList;

public class TrabalhoCSGO {
    
    /*Representação do CS:GO em código*/

    
    public static void main(String[] args) {
        
        System.out.println("*************************************************");
        System.out.println("*******************TIMES*************************");
        System.out.println("*************************************************");
        
        /*Criação dos arraylists dos times e dos jogadores dos times*/
        
        ArrayList<Jogadores> listaJogadores = new ArrayList();
        ArrayList<Jogadores> listaJogadores2 = new ArrayList();
        ArrayList<Jogadores> listaJogadores3 = new ArrayList();
        ArrayList<Jogadores> listaJogadores4 = new ArrayList();
        ArrayList<Times> listaTimes = new ArrayList();
        ArrayList<Partidas> listaPartidas = new ArrayList();
        ArrayList<Partidas> listaPartidas2 = new ArrayList();
        
        /*Criação dos jogadores do primeiro time*/
        
        Jogadores j1 = new Jogadores();
        j1.setNome("Nicolai");
        j1.setNick("Device");
        j1.setSalario(50000);
        
        Jogadores j2 = new Jogadores();
        j2.setNome("Andreas");
        j2.setNick("Yyp9x");
        j2.setSalario(40000);
        
        Jogadores j3 = new Jogadores();
        j3.setNome("Peter");
        j3.setNick("Dupreeh");
        j3.setSalario(40000);
        
        Jogadores j4 = new Jogadores();
        j4.setNome("Lukas");
        j4.setNick("gla1ve");
        j4.setSalario(45000);
        
        Jogadores j5 = new Jogadores();
        j5.setNome("Emil");
        j5.setNick("Magisk");
        j5.setSalario(35000);
        
        listaJogadores.add(j1);
        listaJogadores.add(j2);
        listaJogadores.add(j3);
        listaJogadores.add(j4);
        listaJogadores.add(j5);
        
        /*Criação e impressão do primeiro time*/
        
        Times Astralis = new Times("Astralis", 1, listaJogadores);
        System.out.println("Time: " + Astralis.getNome());
        System.out.println("Rank do time: " + Astralis.getRank());
        Astralis.imprimir_jogadores();
        
        
        /*Criação dos jogadores do segundo time*/
        
        Jogadores j6 = new Jogadores();
        j6.setNome("Yuri");
        j6.setNick("Yuurih");
        j6.setSalario(13000);
        
        Jogadores j7 = new Jogadores();
        j7.setNome("Kaike");
        j7.setNick("KSCERATO");
        j7.setSalario(15000);
        
        Jogadores j8 = new Jogadores();
        j8.setNome("Andrei");
        j8.setNick("arT");
        j8.setSalario(10000);
        
        Jogadores j9 = new Jogadores();
        j9.setNome("Vinicius");
        j9.setNick("Vini");
        j9.setSalario(10000);
        
        Jogadores j10 = new Jogadores();
        j10.setNome("André");
        j10.setNick("drop");
        j10.setSalario(7000);
        
        listaJogadores2.add(j6);
        listaJogadores2.add(j7);
        listaJogadores2.add(j8);
        listaJogadores2.add(j9);
        listaJogadores2.add(j10);
        
        /*Criação e impressão do segundo time*/
        
        
        
        Times Furia = new Times("Furia", 13, listaJogadores2);
        System.out.println("Time: " + Furia.getNome());
        System.out.println("Rank do time: " + Furia.getRank());
        Furia.imprimir_jogadores();

        /*Criação dos jogadores do terceiro time*/
        
        Jogadores j11 = new Jogadores();
        j11.setNome("Oleksandr");
        j11.setNick("s1mple");
        j11.setSalario(70000);
        
        Jogadores j12 = new Jogadores();
        j12.setNome("Kirill");
        j12.setNick("Booml4");
        j12.setSalario(25000);
        
        Jogadores j13 = new Jogadores();
        j13.setNome("Denis");
        j13.setNick("electronic");
        j13.setSalario(40000);
        
        Jogadores j14 = new Jogadores();
        j14.setNome("Valerii");
        j14.setNick("b1t");
        j14.setSalario(20000);
        
        Jogadores j15 = new Jogadores();
        j15.setNome("Ilya");
        j15.setNick("Perfecto");
        j15.setSalario(30000);
        
        listaJogadores3.add(j11);
        listaJogadores3.add(j12);
        listaJogadores3.add(j13);
        listaJogadores3.add(j14);
        listaJogadores3.add(j15);
        
        /*Criação e impressão do Terceiro time*/
        
        Times Navi = new Times("Navi", 2, listaJogadores3);
        System.out.println("Time: " + Navi.getNome());
        System.out.println("Rank do time: " + Navi.getRank());
        Navi.imprimir_jogadores();

/*Criação dos jogadores do quarto time*/
        
        Jogadores j16 = new Jogadores();
        j16.setNome("Nemanja");
        j16.setNick("Hunter");
        j16.setSalario(25000);
        
        Jogadores j17 = new Jogadores();
        j17.setNome("Nikola");
        j17.setNick("Niko");
        j17.setSalario(37000);
        
        Jogadores j18 = new Jogadores();
        j18.setNome("Nemanja");
        j18.setNick("nexa");
        j18.setSalario(30000);
        
        Jogadores j19 = new Jogadores();
        j19.setNome("Audric");
        j19.setNick("jaCkz");
        j19.setSalario(20000);
        
        Jogadores j20 = new Jogadores();
        j20.setNome("François");
        j20.setNick("AmaNEk");
        j20.setSalario(30000);
        
        listaJogadores4.add(j16);
        listaJogadores4.add(j17);
        listaJogadores4.add(j18);
        listaJogadores4.add(j19);
        listaJogadores4.add(j20);
        
        /*Criação e impressão do quarto time*/
        
        Times G2 = new Times("G2", 4, listaJogadores4);
        System.out.println("Time: " + G2.getNome());
        System.out.println("Rank do time: " + G2.getRank());
        G2.imprimir_jogadores();
        
        
        /*Criação e impressão de alguns itens do jogo*/
        System.out.println("*************************************************");
        System.out.println("***********ITENS DO JOGO*************************");
        System.out.println("*************************************************");

        Itens ak47 = new Itens("ak47","30/90","Terrorista","Dano alto, rifle principal");
        ak47.imprimir_item();
        
        Itens m4a4 = new Itens("m4a4","30/90","Contra-terrorista","Dano alto, rifle principal");
        m4a4.imprimir_item();
        
        Itens Bang = new Itens("FlashBang","2/0","Ambos","Não letal, granada de concussão");
        Bang.imprimir_item();
        
        Itens Molly = new Itens("Molotov","1/0","Terrorista","Dano baixo-alto, granada incendiária");
        Molly.imprimir_item();
        
        Itens MP9 = new Itens("MP9", "30/120", "Contra-terrorista", "dano medio-baixo, submetralhadora");
        MP9.imprimir_item();
        
        Itens XM1014 = new Itens("XM 1014","30/120","Ambos", "Dano medio-alto, escopeta automatica");
        XM1014.imprimir_item();

        /*Criação da lista de participantes do campeonato*/
        
        listaTimes.add(Astralis);
        listaTimes.add(Furia);
        listaTimes.add(Navi);
        listaTimes.add(G2);
        

        /*Criação do campeonato*/
        
        Campeonatos Blast = new Campeonatos("Blast Global Final",1000000,listaPartidas,listaTimes);
        
        /*Criação das partidas do campeonato*/
        Partidas p1 = new Partidas(16, "Furia","Astralis","15x0","1x0");
        Partidas p2 = new Partidas(30,"Navi","G2","8x7","8x7");
        Partidas p3 = new Partidas(20,"Navi","Furia","12x3","4x1");
        
        /*Criação da lista de partidas do campeonato*/
        listaPartidas.add(p1);
        listaPartidas.add(p2);
        listaPartidas.add(p3);
        
        System.out.println("*************************************************");
        System.out.println("********CAMPEONATO: BLAST GLOBAL FINAL***********");
        System.out.println("*************************************************");
        
        Blast.imprimir_campeonato();
        
        
        
        Campeonatos DH = new Campeonatos("Dreamhack Masters", 150000,listaPartidas2,listaTimes);
        
        System.out.println("*************************************************");
        System.out.println("********CAMPEONATO: DREAMHACK MASTERS************");
        System.out.println("*************************************************");
        
        /*Criação das partidas do campeonato*/
        Partidas p4 = new Partidas(18, "G2","Astralis","15x0","1x2");
        Partidas p5 = new Partidas(30,"Furia","Navi","8x7","8x7");
        Partidas p6 = new Partidas(30,"Furia","G2","1x14","15x0");
        
        listaPartidas2.add(p4);
        listaPartidas2.add(p5);
        listaPartidas2.add(p6);
        
        DH.imprimir_campeonato();
    }
    
    
}
