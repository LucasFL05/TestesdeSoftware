package faccat;
import java.util.Scanner;

public class Questão29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        double valor1 = sc.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double valor2 = sc.nextDouble();

        System.out.print("Digite o terceiro valor: ");
        double valor3 = sc.nextDouble();

        double somaDosDoisMaiores = calcularSomaDosDoisMaiores(valor1, valor2, valor3);

        System.out.println("A soma dos dois maiores valores é: " + somaDosDoisMaiores);
    }

    // para calcular a soma dos dois maiores valores
    private static double calcularSomaDosDoisMaiores(double a, double b, double c) {
        if ((a >= b && a >= c) || (a <= b && a <= c)) {
            return b + c; // a é o maior valor
        } else if ((b >= a && b >= c) || (b <= a && b <= c)) {
            return a + c; // b é o maior valor
        } else {
            return a + b; // c é o maior valor
        }  
    }
    
}
