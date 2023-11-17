package faccat;
import java.util.Scanner;

public class Questão36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a idade do primeiro homem: ");
        int idadeHomem1 = sc.nextInt();

        System.out.print("Digite a idade do segundo homem (diferente da primeira): ");
        int idadeHomem2 = sc.nextInt();

        while (idadeHomem1 == idadeHomem2) {
            System.out.println("As idades dos homens devem ser diferentes. Digite novamente:");
            System.out.print("Digite a idade do segundo homem: ");
            idadeHomem2 = sc.nextInt();
        }

        System.out.print("Digite a idade da primeira mulher: ");
        int idadeMulher1 = sc.nextInt();

        System.out.print("Digite a idade da segunda mulher (diferente da primeira): ");
        int idadeMulher2 = sc.nextInt();

        while (idadeMulher1 == idadeMulher2) {
            System.out.println("As idades das mulheres devem ser diferentes. Digite novamente:");
            System.out.print("Digite a idade da segunda mulher: ");
            idadeMulher2 = sc.nextInt();
        }

        int somaIdades = idadeHomem2 + idadeMulher1;

        int produtoIdades = idadeHomem1 * idadeMulher2;

        System.out.println("Soma das idades do homem mais velho com a mulher mais nova: " + somaIdades);
        System.out.println("Produto das idades do homem mais novo com a mulher mais velha: " + produtoIdades);

        sc.close();
    }
}
