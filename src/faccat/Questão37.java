package faccat;
import java.util.Scanner;

public class Questão37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade (em Kg) de morangos adquiridos: ");
        double kgMorangos = sc.nextDouble();

        System.out.print("Digite a quantidade (em Kg) de maçãs adquiridas: ");
        double kgMacas = sc.nextDouble();

        double precoMorango;
        double precoMaca;

        if (kgMorangos <= 5) {
            precoMorango = 2.50;
        } else {
            precoMorango = 2.20;
        }

        if (kgMacas <= 5) {
            precoMaca = 1.80;
        } else {
            precoMaca = 1.50;
        }

        double totalMorangos = kgMorangos * precoMorango;
        double totalMacas = kgMacas * precoMaca;
        double valorTotal = totalMorangos + totalMacas;

        if (kgMorangos + kgMacas > 8 || valorTotal > 25.00) {
            valorTotal *= 0.9; 
        }

        System.out.printf("O valor a ser pago pelo cliente é: R$ %.2f%n", valorTotal);

        sc.close();
    }
}
