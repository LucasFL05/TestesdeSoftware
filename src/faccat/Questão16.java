package faccat;
import java.util.Scanner;

public class Questão16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de maçãs compradas: ");
        int quantidadeMacas = sc.nextInt();

        double custoUnitario;

        if (quantidadeMacas < 12) {
            custoUnitario = 1.30;
        } else {
            custoUnitario = 1.00;
        }

        double custoTotal = quantidadeMacas * custoUnitario;

        System.out.println("O custo total da compra é: R$ " + custoTotal);

        sc.close();
    }
}
