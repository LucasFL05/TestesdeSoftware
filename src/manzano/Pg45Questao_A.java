package manzano;
import java.util.Scanner;

public class Pg45Questao_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para a tabuada: ");
        int numero = scanner.nextInt();

        System.out.println("Tabuada de multiplicar para o número " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

        scanner.close();
    }
}