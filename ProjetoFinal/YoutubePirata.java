package ProjetoFinal;

public class YoutubePirata {
    public static void main(String[] args) {
        Video v[] = new Video[2];
        Gafanhoto g[] = new Gafanhoto[5];

        v[0] = new Video("teste");
        System.out.println(v[0].toString());
        v[1] = new Video("teste2");
        System.out.println(v[1].toString());
        
        g[0] = new Gafanhoto("Zequinha", 18, 'M', "Ze");
        System.out.println(g[0].toString());
        g[1] = new Gafanhoto("Ciclano", 24, 'M', "cicli");
        System.out.println(g[0].toString());
        
        Vizualizacao vis1 = new Vizualizacao(g[0], v[0]);
        vis1.avaliar(78);
        System.out.println(vis1.toString());
    }
}
