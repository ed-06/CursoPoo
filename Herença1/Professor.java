package Herença1;

public class Professor extends Pessoa{
    public Professor(String n, int i, char s) {
        super(n, i, s);
    }
    private String especialidade;
    private int salario;

    public void receberAum(){

    }
    public String getEspecialidade() {
        return especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    public int getSalario() {
        return salario;
    }
    public void setSalario(int salario) {
        this.salario = salario;
    }
}
