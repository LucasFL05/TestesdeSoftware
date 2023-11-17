package faccat;
import java.util.Scanner;

public class Questão35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de litros vendidos: ");
        double litros = sc.nextDouble();

        System.out.print("Digite o tipo de combustível (A para álcool, G para gasolina): ");
        char tipoCombustivel = sc.next().charAt(0);

        double precoAlcool = 2.90;
        double precoGasolina = 3.30;

        double valorPago = calcularValorAPagar(litros, tipoCombustivel, precoAlcool, precoGasolina);

        System.out.printf("O valor a ser pago pelo cliente é: R$ %.2f%n", valorPago);

        sc.close();
    }

    private static double calcularValorAPagar(double litros, char tipoCombustivel, double precoAlcool, double precoGasolina) {
        double descontoPorLitro;

        if (tipoCombustivel == 'A' || tipoCombustivel == 'a') {
            if (litros <= 20) {
                descontoPorLitro = 0.03; 
            } else {
                descontoPorLitro = 0.05; 
            }
        } else if (tipoCombustivel == 'G' || tipoCombustivel == 'g') {
            if (litros <= 20) {
                descontoPorLitro = 0.04; 
            } else {
                descontoPorLitro = 0.06; 
            }
        } else {
            
            System.out.println("Tipo de combustível inválido. Por favor, escolha A para álcool ou G para gasolina.");
            return 0.0;
        }

       
        double precoPorLitro = (tipoCombustivel == 'A' || tipoCombustivel == 'a') ? precoAlcool : precoGasolina;
        double valorComDesconto = litros * (precoPorLitro - (precoPorLitro * descontoPorLitro));

        return valorComDesconto;
    }
}
