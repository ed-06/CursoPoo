package Polimorfismo;

public class Principal{
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();

        m.setPeso(35.5f);
        m.setCorPelo("Marrom");
        m.alimentar();
        m.locomover();
        m.emitirSom();

        a.locomover();
        Lobo l = new Lobo();
        l.emitirSom();

        Cachorro c = new Cachorro();
        c.emitirSom();
    }
}