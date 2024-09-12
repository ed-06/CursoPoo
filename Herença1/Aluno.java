package Herença1;

public class Aluno extends Pessoa {
    public Aluno(String n, int i, char s) {
        super(n, i, s);
    }
    private int matricula;
    private String curso;

    public void cancelarMatricula(){

    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public void pagarMensalidade(){
        
    }
}
