package Herença1;
public class Pessoa {
    private String name;
    private int idade;
    private char sexo;

    public Pessoa(String n, int i, char s){
        this.name = n;
        this.idade = i;
        this.sexo = s;
    }

    @Override
    public String toString() {
        System.out.println(name);
        System.out.println(idade);
        System.out.println(sexo);
        return super.toString();
    }
    public void fazerAniv(){
        this.idade ++;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

}