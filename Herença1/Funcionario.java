package Herença1;
public class Funcionario extends Pessoa{
    public Funcionario(String n, int i, char s) {
        super(n, i, s);
    }
    private String setor;
    private boolean trabalhando = false;

    public void mudarTrabalho(){
        this.trabalhando =! this.trabalhando;
    }
    public void setSetor(String setor) {
        this.setor = setor; 
    }
    public String getSetor() {
        return setor;
    }
    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    public void getTrabalhando(){
    }
}
