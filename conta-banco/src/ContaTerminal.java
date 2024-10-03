import java.util.Scanner;

public class ContaTerminal {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por gentileza, digite o numero da sua conta:");
        int numeroConta = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Por favor, digite o número da agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do cliente");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o seu saldo");
        double saldo = scanner.nextDouble();

        String mensagem = String.format("Obrigado por criar uma conta em nosso banco." + "Sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", nomeCliente, agencia, numeroConta, saldo);
        System.out.println(mensagem);

        scanner.close();
    }   
}


// TODO
// EXIBIR AS MENSAGENS PARA O NOSSO USUÁRIO;
//OBTER PELA SCANNER OS VALORES DIGITADOS NO TERMINAL
//EXIBIR A MENSAGEM CONTA CRIADA