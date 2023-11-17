package faccat;
import java.util.Scanner;

public class Questão30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        double valor1 = sc.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double valor2 = sc.nextDouble();

        System.out.print("Digite o terceiro valor: ");
        double valor3 = sc.nextDouble();

        ordenarValores(valor1, valor2, valor3);
    }

    private static void ordenarValores(double a, double b, double c) {
        if (a <= b && a <= c) {
            if (b <= c) {
                System.out.println("Valores em ordem crescente: " + a + ", " + b + ", " + c);
            } else {
                System.out.println("Valores em ordem crescente: " + a + ", " + c + ", " + b);
            }
        } else if (b <= a && b <= c) {
            if (a <= c) {
                System.out.println("Valores em ordem crescente: " + b + ", " + a + ", " + c);
            } else {
                System.out.println("Valores em ordem crescente: " + b + ", " + c + ", " + a);
            }
        } else {
            if (a <= b) {
                System.out.println("Valores em ordem crescente: " + c + ", " + a + ", " + b);
            } else {
                System.out.println("Valores em ordem crescente: " + c + ", " + b + ", " + a);
            }
        }
    }
}
