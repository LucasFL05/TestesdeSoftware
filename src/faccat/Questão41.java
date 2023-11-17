package faccat;
import java.util.Scanner;

public class Questão41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a nota da primeira verificação (N1): ");
        double N1 = sc.nextDouble();

        System.out.print("Digite a nota da segunda verificação (N2): ");
        double N2 = sc.nextDouble();

        System.out.print("Digite a nota da terceira verificação (N3): ");
        double N3 = sc.nextDouble();

        System.out.print("Digite a média dos exercícios: ");
        double mediaExercicios = sc.nextDouble();

        double mediaAproveitamento = (N1 + N2 * 2 + mediaExercicios) / 7;

        System.out.println("Média de Aproveitamento: " + mediaAproveitamento);

        String conceito = determinarConceito(mediaAproveitamento);

        System.out.println("Conceito do aluno: " + conceito);

        sc.close();
    }

    private static String determinarConceito(double mediaAproveitamento) {
        if (mediaAproveitamento >= 9.0) {
            return "A";
        } else if (mediaAproveitamento >= 7.5 && mediaAproveitamento < 9.0) {
            return "B";
        } else if (mediaAproveitamento >= 6.0 && mediaAproveitamento < 7.5) {
            return "C";
        } else {
            return "D";
        }
    }
}
