package manzano;
import java.util.Scanner;

public class Pg45Questao_I {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidadeValores = 10;
        int somatorio = 0;

        // Leitura dos 10 valores
        for (int i = 1; i <= quantidadeValores; i++) {
            System.out.print("Digite o valor #" + i + ": ");
            int valor = scanner.nextInt();
            somatorio += valor;
        }

        // Cálculo da média aritmética
        double media = (double) somatorio / quantidadeValores;

        // Apresentação do somatório e da média
        System.out.println("Total do somatório: " + somatorio);
        System.out.println("Média aritmética: " + media);

        scanner.close();
    }
}