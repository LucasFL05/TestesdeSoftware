package manzano;
import java.util.Scanner;

public class Pg45Questao_F {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da base (B): ");
        double base = scanner.nextDouble();

        System.out.print("Digite o valor do expoente (E): ");
        int expoente = scanner.nextInt();

        double resultado = calcularPotencia(base, expoente);
        System.out.println(base + "^" + expoente + " = " + resultado);

        scanner.close();
    }

    private static double calcularPotencia(double base, int expoente) {
        double resultado = 1;

        for (int i = 0; i < Math.abs(expoente); i++) {
            resultado *= base;
        }

        if (expoente < 0) {
            resultado = 1 / resultado;
        }

        return resultado;
    }
}