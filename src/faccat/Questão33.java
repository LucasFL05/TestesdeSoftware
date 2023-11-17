package faccat;
import java.util.Scanner;

public class Questão33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        double valor1 = sc.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double valor2 = sc.nextDouble();

        if (valor1 == valor2) {
            System.out.println("Números iguais.");
        } else if (valor1 > valor2) {
            System.out.println("Primeiro é maior.");
        } else {
            System.out.println("Segundo é maior.");
        }

        sc.close();
    }
}
