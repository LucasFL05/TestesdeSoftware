package faccat;
import java.util.Scanner;

public class Questão9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salário mensal atual do funcionário: ");
        double salarioAtual = sc.nextDouble();

        System.out.print("Digite o percentual de reajuste (em porcentagem): ");
        double percentualReajuste = sc.nextDouble();

        double valorReajuste = salarioAtual * (percentualReajuste / 100);

        double novoSalario = salarioAtual + valorReajuste;

        System.out.println("O novo salário do funcionário é: " + novoSalario);

        sc.close();
    }
}
