package faccat;
import java.util.Scanner;

public class Questão40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a descrição do produto: ");
        String descricaoProduto = sc.nextLine();

        System.out.print("Digite a quantidade adquirida: ");
        int quantidadeAdquirida = sc.nextInt();

        System.out.print("Digite o preço unitário: ");
        double precoUnitario = sc.nextDouble();

        double total = quantidadeAdquirida * precoUnitario;

        double desconto = calcularDesconto(quantidadeAdquirida, total);

        double totalAPagar = total - desconto;

        System.out.println("Descrição do produto: " + descricaoProduto);
        System.out.println("Total: R$ " + total);
        System.out.println("Desconto: R$ " + desconto);
        System.out.println("Total a pagar: R$ " + totalAPagar);

        sc.close();
    }

    private static double calcularDesconto(int quantidadeAdquirida, double total) {
        double desconto = 0.0;

        if (quantidadeAdquirida <= 5) {
            desconto = total * 0.02; 
        } else if (quantidadeAdquirida > 5 && quantidadeAdquirida <= 10) {
            desconto = total * 0.03; 
        } else if (quantidadeAdquirida > 10) {
            desconto = total * 0.05; 
        }

        return desconto;
    }
}
