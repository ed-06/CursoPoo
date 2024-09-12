package Polimorfismo;

public abstract class Animal {
    protected float peso;
    protected int idade;
    protected int membros;

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getIdade() {
        return idade;
    }
    public void setMembros(int membros) {
        this.membros = membros;
    }
    public int getMembros() {
        return membros;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public float getPeso() {
        return peso;
    }

    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();
}
