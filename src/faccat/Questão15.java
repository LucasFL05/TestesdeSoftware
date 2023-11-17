package faccat;
import java.util.Scanner;

public class Questão15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int valor = sc.nextInt();

        if (valor >= 0) {
            System.out.println("É POSITIVO");
        } else {
            System.out.println("É NEGATIVO");
        }

        sc.close();
    }
}
