package Aula9b;

public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String t, String a, int tot, Pessoa l){
        this.titulo = t;
        this.autor = a;
        this.totPaginas = tot;
        aberto = false;
        this.pagAtual = 0;
        this.leitor = l;
    }

    public String detalhes() {
        return "Livro{" + "\n titulo=" + titulo + "\n autor=" + autor + "\n totPaginas=" + totPaginas + 
        "\n pagAtual=" + pagAtual + "\n aberto= " + aberto + "\n leitor=" + leitor.getNome() + 
        "\n idade=" + leitor.getIdade() + "\n sexo=" + leitor.getSexo() + '}';
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getAutor() {
        return autor;
    }
    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    public Pessoa getLeitor() {
        return leitor;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }
    public int getTotPaginas() {
        return totPaginas;
    }
    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }
    public int getPagAtual() {
        return pagAtual;
    }


    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int p) {
        if (p > this.totPaginas){
            this.pagAtual = 0;
        } else {
            this.pagAtual = p;
        }
    }

    @Override
    public void avancarPag() {
        this.pagAtual ++;
    }

    @Override
    public void voltarPag() {
        this.pagAtual --;
    }
}