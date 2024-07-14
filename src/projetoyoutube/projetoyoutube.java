package projetoyoutube;

public class projetoyoutube {
    public static void main(String[] args){
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 10 de HTML5");

        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Alexandre", 20, "Masculino", "alex@gmail");
        g[1] = new Gafanhoto("Laís",19, "Feminino","lais@gmail.com");

        Visualizacao vs[] = new Visualizacao[5];
        vs[0] = new Visualizacao(g[0], v[2]);
        vs[0].avaliar();
        System.out.println(vs[0].toString());
        vs[1] = new Visualizacao(g[0], v[2]);
        vs[1].avaliar(35f);
        System.out.println(vs[0].toString());
        vs[2] = new Visualizacao(g[0], v[1]);
        System.out.println(vs[2].toString());

    }
}
