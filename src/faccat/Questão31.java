package faccat;
import java.util.Scanner;

public class Questão31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do lado A: ");
        double ladoA = sc.nextDouble();

        System.out.print("Digite o valor do lado B: ");
        double ladoB = sc.nextDouble();

        System.out.print("Digite o valor do lado C: ");
        double ladoC = sc.nextDouble();

        if (formaTriangulo(ladoA, ladoB, ladoC)) {
            System.out.println("Os valores formam um triângulo.");
        } else {
            System.out.println("Os valores NÃO formam um triângulo.");
        }
    }

    private static boolean formaTriangulo(double a, double b, double c) {
        return (a < b + c) && (b < a + c) && (c < a + b);
        
        
    }
    
}
