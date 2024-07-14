package projetoyoutube;

public class Video implements AcoesVideo {
    private String titulo;
    private boolean reproduzindo;
    private int curtidas, avaliacao, views;

    public Video(String titulo){
        this.titulo = titulo;
        this.avaliacao = 1;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        int nova;
        nova = (this.avaliacao + avaliacao)/views;
        this.avaliacao = nova;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    @Override
    public void play() {
        this.reproduzindo = true;
    }

    @Override
    public void pause() {
        this.reproduzindo = false;

    }

    @Override
    public void like() {
        this.curtidas += 1;
    }

    @Override
    public String toString() {
        return "------------Video------------ " + '\n' +
                "titulo: " + titulo + '\n' +
                "reproduzindo: " + reproduzindo + '\n' +
                "curtidas: " + curtidas + '\n' +
                "avaliacao: " + avaliacao + '\n' +
                "views: " + views;
    }
}
