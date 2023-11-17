package faccat;
import java.util.Scanner;

public class Questão25 {
    @SuppressWarnings("unused")
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número da conta do cliente: ");
        int numeroConta = sc.nextInt();

        System.out.print("Digite o saldo da conta: R$ ");
        double saldo = sc.nextDouble();

        System.out.print("Digite o débito: R$ ");
        double debito = sc.nextDouble();

        System.out.print("Digite o crédito: R$ ");
        double credito = sc.nextDouble();

        double saldoAtual = saldo - debito + credito;

        System.out.println("O saldo atual da conta é: R$ " + saldoAtual);

        if (saldoAtual >= 0) {
            System.out.println("Saldo Positivo");
        } else {
            System.out.println("Saldo Negativo");
        }

        sc.close();
    }
}
