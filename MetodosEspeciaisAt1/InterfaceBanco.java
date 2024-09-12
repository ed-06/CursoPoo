package MetodosEspeciaisAt1;
import java.util.Scanner;
public class InterfaceBanco{
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Software de banco!");
        System.out.println("Escolha uma das opções abaixo");
        System.out.println("1. Sacar");
        System.out.println("2. Depositar");
        System.out.println("3. Ver saldo");
        System.out.println("4. Pagar mensalidade");
        System.out.println("5. Abrir conta");
        System.out.println("6. Fechar conta");
        System.out.println("7. Para ver as opções novamente");
        System.out.println("Qualquer outra opção para sair do programa!");
        ContaBanco c1 = new ContaBanco(1, "contPou", "Jubileu", 0, true);
        while (true){
            int escolha = leitor.nextInt();
            switch (escolha) {
                case 1:
                    c1.setSacar();
                    break;
                case 2:
                    c1.setDepositar();
                    break;
                case 3:
                    c1.getSaldoConta();
                    break;
                case 4:
                    c1.setPagarMensal();
                    break;
                case 5:
                    c1.setAbrirConta();
                    break;
                case 6:
                    c1.setFecharConta();
                    break;
                case 7:
                    c1.opções();
                default:
                    break;
            }
            leitor.close();
        }
    }
}
/*
 * jubileu 300 poupança
creusa 500 conta corrente 
creusa saca 100 

 */