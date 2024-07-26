package RelacionamentoEntreClasses;
import java.util.Random;
public class Luta {
    private Lutador desafiado;
    private Lutador desafiante; 
    private int rounds;
    private boolean aprovada;
   
    public void marcarLuta(Lutador l1, Lutador l2) {
        l1.setCategoria(l1.getCategoria());
        l2.setCategoria(l2.getCategoria());
        if (l1 == null || l2 == null) {
            this.aprovada = false;
            System.out.println("Lutadores não podem ser nulos.");
            return;
        }
        
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            this.aprovada = false;
        }
    }
    
    public void lutar() {
        if (this.aprovada) {
            if (this.desafiado != null && this.desafiante != null) {
                System.out.println("### DESAFIADO ###");
                this.desafiado.apresentar(); // linha 26!
                System.out.println("### DESAFIANTE ###");
                this.desafiante.apresentar();
                
                Random random = new Random();
                int vencedor = random.nextInt(3); // 0, 1, ou 2
                
                switch (vencedor) {
                    case 0:
                        System.out.println("Empate!");
                        this.desafiado.empatarLuta();
                        this.desafiante.empatarLuta();
                        break;
                    case 1:
                        System.out.println("Vitória do lutador: " + this.desafiado.getNome());
                        this.desafiado.ganharLuta();
                        this.desafiante.perderLuta();
                        break;
                    case 2:
                        System.out.println("Vitória do lutador: " + this.desafiante.getNome());
                        this.desafiado.perderLuta();
                        this.desafiante.ganharLuta();
                        break;
                }
            } else {
                System.out.println("Desafiado ou desafiante não foram definidos corretamente.");
            }
        } else {
            System.out.println("A luta não pode acontecer!");
        }
    }    

    public Lutador getDesafiado() {
        return desafiado;
    }
    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }
    public Lutador getDesafiante() {
        return desafiante;
    }
    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }
    public int getRounds() {
        return rounds;
    }
    public void setRounds(int rounds) {
        this.rounds = rounds;
    }
    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
