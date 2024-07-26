package RelacionamentoEntreClasses;
public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;  

    public Lutador(String no, String nacio, int idad, float alt, float pes, int vito, int der, int emp) {
        this.nome = no;
        this.nacionalidade = nacio;
        this.idade = idad;
        this.altura = alt;
        this.peso = pes;
        this.vitorias = vito;
        this.derrotas = der;
        this.empates = emp;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
        setCategoria(categoria);
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        if (this.peso < 52.2f){
            this.categoria = "Inválido";
        } else if (this.peso <= 70.3){
            this.categoria = "Leve";
        } else if (this.peso <= 83.6 ){
            this.categoria = "Médio";
        } else if (this.peso <= 120.2){
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }
    public void apresentar(){
        System.out.println();
        System.out.println("CHEGOU A HORA!");
        System.out.println("lutador: " + this.getNome());
        System.out.println("Origem: " + this.getNacionalidade());
        System.out.println(this.getIdade() + "Anos");
        System.out.println(this.getAltura() + "m de altura");
        System.out.println("Pesando " + this.getPeso() + "Kg");
        System.out.println("Ganhou: " + this.getVitorias());
        System.out.println("Perdeu: " + this.getDerrotas());
        System.out.println("Empates: " + this.getEmpates());
        System.out.println();
    }
    public void status(){
        System.out.println(this.getNome());
        System.out.println("É um peso " + this.getCategoria());
        System.out.println(this.getVitorias() + " vitorias");
        System.out.println(this.getDerrotas() + " perdeu");
        System.out.println(this.getEmpates() + " empates");

    }
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() - 1);
    }
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }
    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }
    public int getVitorias() {
        return vitorias;
    }
    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }
    public int getDerrotas() {
        return derrotas;
    }
    public void setEmpates(int empates) {
        this.empates = empates;
    }
    public int getEmpates() {
        return empates;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    public int getIdade() {
        return idade;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public float getAltura() {
        return altura;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
}