package faccat;
import java.util.Scanner;

public class Questão13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = sc.nextDouble();

        double pesoNota1 = 2;
        double pesoNota2 = 3;
        double pesoNota3 = 5;

        double mediaFinal = (nota1 * pesoNota1 + nota2 * pesoNota2 + nota3 * pesoNota3) / (pesoNota1 + pesoNota2 + pesoNota3);

        System.out.println("A média final do aluno é: " + mediaFinal);

        sc.close();
    }
}
