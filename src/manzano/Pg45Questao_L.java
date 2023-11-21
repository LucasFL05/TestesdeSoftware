package manzano;
import java.util.Scanner;

public class Pg45Questao_L {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        System.out.println("Digite valores positivos inteiros. Para encerrar, digite um valor negativo.");

        int valor;

        do {
            System.out.print("Digite um valor: ");
            valor = scanner.nextInt();

            if (valor >= 0) {
                // Atualizar o maior e o menor valores
                maior = Math.max(maior, valor);
                menor = Math.min(menor, valor);
            }

        } while (valor >= 0);

        // Apresentar o maior e o menor valores
        if (maior != Integer.MIN_VALUE && menor != Integer.MAX_VALUE) {
            System.out.println("Maior valor informado: " + maior);
            System.out.println("Menor valor informado: " + menor);
        } else {
            System.out.println("Nenhum valor positivo foi informado.");
        }

        scanner.close();
    }
}