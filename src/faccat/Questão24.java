package faccat;
import java.util.Scanner;

public class Questão24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salário fixo do vendedor: R$ ");
        double salarioFixo = sc.nextDouble();

        System.out.print("Digite o valor das vendas efetuadas pelo vendedor: R$ ");
        double valorVendas = sc.nextDouble();

        double comissao;

        if (valorVendas <= 1500) {
            comissao = 0.03 * valorVendas; 
        } else {
            comissao = 0.03 * 1500 + 0.05 * (valorVendas - 1500); 
        }

        double salarioTotal = salarioFixo + comissao;

        System.out.println("O salário total do vendedor é: R$ " + salarioTotal);

        sc.close();
    }
}
