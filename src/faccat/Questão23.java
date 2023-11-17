package faccat;
import java.util.Scanner;

public class Questão23 {
    @SuppressWarnings("resource")
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome;
        double altura, pesoIdeal;
        char sexo;

        System.out.print("Digite o nome: ");
        nome = sc.nextLine();

        System.out.print("Digite a altura: ");
        altura = sc.nextDouble();

        System.out.print("Digite o sexo (M ou F): ");
        sexo = sc.next().charAt(0);

        if (sexo == 'M') {
            pesoIdeal = (72.7 * altura) - 58;
        } else if (sexo == 'F') {
            pesoIdeal = (62.1 * altura) - 44.7;
        } else {
            System.out.println("Sexo inválido. Por favor, digite M ou F.");
            return;
        }

        System.out.println("O peso ideal para " + nome + " é: " + pesoIdeal);

        sc.close();
    }
}
