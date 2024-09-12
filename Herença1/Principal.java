package Herença1;
public class Principal {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Erica", 19, 'M');
        Aluno p2 = new Aluno("Joao", 20, 'F');
        Professor p3 = new Professor("Maria", 22, 'F') ;
        Funcionario p4 = new Funcionario("Fabio", 35, 'M');

        p2.setCurso("Software");

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}
    