package ProjetoFinal;

public class Video implements AcoesVideo{
    private String titulo;
    private int avaliacao;
    private long views;
    private long curtidas;
    private boolean reproduzindo;

    public Video(String titulo){
        this.titulo = titulo;
        this.avaliacao = 1;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }

    public void setAvaliacao(int avaliacao) {
        int nova;
        nova = (int) ((this.avaliacao + avaliacao)/this.views);
        this.avaliacao = nova;
    }
    public int getAvaliacao() {
        return avaliacao;
    }
    public long getCurtidas() {
        return curtidas;
    }
    public void setCurtidas(long curtidas) {
        this.curtidas = curtidas;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }
    public long getViews() {
        return views;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setViews(long views) {
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
        this.curtidas ++;
    }
    @Override
    public String toString(){
        return "Video: " + "\n" + "titulo: " + titulo + ", avaliacao: " + avaliacao + ", views: " + views + 
        ", curtidas: " + curtidas + ", reproduzindo: " + reproduzindo;
    }
}

