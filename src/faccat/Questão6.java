package faccat;
import java.util.Scanner;

public class Questão6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a base do retângulo: ");
        double base = sc.nextDouble();

        System.out.print("Digite a altura do retângulo: ");
        double altura = sc.nextDouble();

        double area = base * altura;

        System.out.println("A área do retângulo é: " + area);

        sc.close();
    }
}
