package ProjetoFinal;

public abstract class Pessoa {
    protected String name;
    protected int idade;
    protected char sexo;
    protected int experiencia;

    public Pessoa(String name, int idade, char sexo) {
        this.name = name;
        this.idade = idade;
        this.sexo = sexo;
        this.experiencia = 0;
    }

    public int getExperiencia() {
        return experiencia;
    }
    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
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

    protected void ganharExp(){
      //  this.setExperiencia(experiencia) += 1;
    }
    @Override
    public String toString(){
        return "Pessoa: \n" + "nome: " + name + ", idade: " + idade + ", sexo: " + sexo;
    }
}

