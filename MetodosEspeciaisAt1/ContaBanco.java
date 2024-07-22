package MetodosEspeciaisAt1;
import java.util.Scanner;
public class ContaBanco {
    Scanner scanner = new Scanner(System.in);
    public int numConta;
    protected String tipoConta; //Conta corrente e conta poupança
    private String dono;
    private double saldo;
    private boolean status; //aberta ou fechada
    public ContaBanco(int n, String t, String d, double s, boolean st){
       numConta = n;
       tipoConta = t;
       dono = d;
       saldo = s;
       status = st;
    }
    //CONSTRUTUTOR SALDO 0 E STATUS FECHADA
    
    public void saldoConta (double saldo){
        System.out.println("Saldo da conta: " + this.saldo);
    }
    public void sacar(){
        if (this.status == true){
            System.out.println("Saldo da conta: " + this.saldo);
            System.out.println("Deseja sacar quanto?");
            double sacar = scanner.nextInt();
            if (this.saldo >= sacar && sacar != 0 && this.saldo>0){
                this.saldo -= sacar;
                System.out.println("Saldo da conta após o saque: " + this.saldo);
            } else {
                System.out.println("Saque inválido!");
            }
        }
        System.out.println("Conta invalida!");
    }
    public void depositar(){
        if (this.status == true){
            System.out.println("Deseja depositar quanto?");
            int dep = scanner.nextInt();
            this.saldo = dep;
        } else {
            System.out.println("Conta invalida!");
        }
    }
    public void pagarMensal(String tipoConta){ //check
        if (status == true){
            switch (this.tipoConta){
                case "contCon":
                    this.saldo -= 12;
                    break;
                case "contPou":
                    this.saldo -= 20;
                    break;
                default:
                    break;
            }
        }
    }
    public void abrirConta(){
        System.out.println("tipo de conta:");
        System.out.println("1. Conta corrente");
        System.out.println("2. Conta poupança");
        int escolha = scanner.nextInt();
        if (escolha == 1){
            tipoConta = "contCon";
            this.saldo += 50;
            this.status = true;
        } else {
            tipoConta = "contPou";
            this.saldo += 150;
            this.status = true;
        }
    }
    public void fecharConta(){
        if (this.saldo == 0 && this.status == true){
            System.out.println("Conta fechada com sucesso!");
            this.status = false;
        } else {
            System.out.println("Saldo maior que zero ou conta invalida!");
        }
    }
}