package MetodosEspeciaisAt1;
import java.util.Scanner;
public class ContaBanco {
    Scanner scanner = new Scanner(System.in);
    public int numConta;
    protected String tipoConta; // Conta corrente e conta poupança
    private String dono;
    private double saldo;
    private boolean status; // aberta ou fechada

    public ContaBanco(int n, String t, String d, double s, boolean st) {
      numConta = n;
        tipoConta = t;
        dono = d;
        saldo = s;
        status = st;
    }

    public void getNumDaConta() {
        this.saldo = 0;
        this.status = false;
    }

    public double getSaldoConta() {
        System.out.println("Saldo da conta: " + this.saldo);
        return this.saldo;
    }

    public void setSacar() {
        if (this.status == true) {
            System.out.println("Saldo da conta: " + this.saldo);
            System.out.println("Deseja sacar quanto?");
            double sacar = scanner.nextDouble();
            if (this.saldo >= sacar && sacar > 0) {
                this.saldo -= sacar;
                System.out.println("Saldo da conta após o saque: " + this.saldo);
            } else {
                System.out.println("Saque inválido!");
            }
        } else {
            System.out.println("Conta inválida!");
        }
    }

    public void setDepositar() {
        if (this.status == true) {
            System.out.println("Deseja depositar quanto?");
            double dep = scanner.nextDouble();
            this.saldo += dep;
            System.out.println("Saldo após depósito: " + this.saldo);
        } else {
            System.out.println("Conta inválida!");
        }
    }

    public void setPagarMensal() {
        if (this.status == true) {
            switch (this.tipoConta) {
                case "contCon":
                    if (this.saldo >= 12) {
                        this.saldo -= 12;
                        System.out.println("Mensalidade de conta corrente paga. Saldo atual: " + this.saldo);
                    } else {
                        System.out.println("Saldo insuficiente para pagar a mensalidade.");
                    }
                    break;
                case "contPou":
                    if (this.saldo >= 20) {
                        this.saldo -= 20;
                        System.out.println("Mensalidade de conta poupança paga. Saldo atual: " + this.saldo);
                    } else {
                        System.out.println("Saldo insuficiente para pagar a mensalidade.");
                    }
                    break;
                default:
                    System.out.println("Tipo de conta inválido.");
                    break;
            }
        } else {
            System.out.println("Conta inativa. Não é possível pagar a mensalidade.");
        }
    }

    public void setAbrirConta() {
        System.out.println("Tipo de conta:");
        System.out.println("1. Conta corrente");
        System.out.println("2. Conta poupança");
        int escolha = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println("Seu nome?");
        this.dono = scanner.nextLine();
        if (escolha == 1) {
            tipoConta = "contCon";
            this.saldo = 50;
            this.status = true;
        } else if (escolha == 2) {
            tipoConta = "contPou";
            this.saldo = 150;
            this.status = true;
        } else {
            System.out.println("Escolha inválida.");
        }
    }

    public void setFecharConta() {
        System.out.println("Deseja fechar a conta Sr." + this.dono);
        if (this.status == true) {
            if (this.saldo == 0) {
                System.out.println("Conta fechada com sucesso!");
                this.status = false;
            } else {
                System.out.println("Conta não pode ser fechada. Saldo maior que zero!");
            }
        } else {
            System.out.println("Conta inválida ou já fechada!");
        }
    }
    public void opções(){
        System.out.println("1. Sacar");
        System.out.println("2. Depositar");
        System.out.println("3. Ver saldo");
        System.out.println("4. Pagar mensalidade");
        System.out.println("5. Logar na conta");
        System.out.println("6. Fechar conta");
        System.out.println("7. Para ver as opções novamente");
    }
}