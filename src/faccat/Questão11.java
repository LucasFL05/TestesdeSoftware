package faccat;
import java.util.Scanner;

public class Questão11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de carros vendidos: ");
        int numCarrosVendidos = sc.nextInt();

        System.out.print("Digite o valor total das vendas: ");
        double valorTotalVendas = sc.nextDouble();

        System.out.print("Digite o salário fixo do vendedor: ");
        double salarioFixo = sc.nextDouble();

        System.out.print("Digite o valor por carro vendido: ");
        double valorPorCarro = sc.nextDouble();

        double comissao = 0.05 * valorTotalVendas;

        double salarioFinal = salarioFixo + (numCarrosVendidos * valorPorCarro) + comissao;

        System.out.println("O salário final do vendedor é: " + salarioFinal);

        sc.close();
    }
}
