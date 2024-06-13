import java.util.Scanner;

public class TerminalAccount {
    public static void main(String[] args) {
        Scanner numberReceived = new Scanner(System.in);
        System.out.print("Por favor, digite o número da Conta : ");
        int accountNumber = Integer.parseInt(numberReceived.nextLine());

        Scanner accountReceived = new Scanner(System.in);
        System.out.print("Por favor, digite o número da Agência : ");
        String accountAgency = accountReceived.nextLine();

        Scanner nameReceived = new Scanner(System.in);
        System.out.print("Por favor, digite o Nome do Cliente : ");
        String userName = nameReceived.nextLine();

        Scanner balanceReceived = new Scanner(System.in);
        System.out.print("Por favor, digite o valor do Saldo : ");
        double balance = Double.parseDouble(balanceReceived.nextLine());

        System.out.println("\nOlá " + userName + ", obrigado por criar uma conta em nosso banco, " +
                "sua agência é " + accountAgency + ", conta " + accountNumber + " e seu saldo de R$ "
                + balance + " já está disponível para saque !");

    }
}