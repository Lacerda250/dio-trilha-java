import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        System.out.println("Por favor, informe o número da sua conta bancária: ");
        Scanner scanner = new Scanner(System.in);
        int contaBancaria = scanner.nextInt();
        System.out.println("Agora, informe a sua agência: ");
        String agencia = scanner.next();
        scanner.nextLine();
        System.out.println("Nos informe o seu nome: ");
        String nomeCliente = scanner.nextLine();
        System.out.println("Por fim, informe o saldo disponível na sua conta: ");
        double saldo = scanner.nextDouble();
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + contaBancaria + " e seu saldo " + saldo + " já está disponível para saque.");
        scanner.close();
    }
}