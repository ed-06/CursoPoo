package Aula9b;

public class Pessoa{
    private String nome;
    private int idade;
    private char sexo;

    public Pessoa(String n, int i, char s){
        this.nome = n;
        this.idade = i;
        this.sexo = s;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public void fazerAniver(){
        this.idade ++;

    }
}

