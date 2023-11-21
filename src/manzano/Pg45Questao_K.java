package manzano;
import java.util.Scanner;

public class Pg45Questao_K {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double areaTotal = 0;
        String resposta;

        do {
            // Solicitar informações do cômodo
            System.out.print("Digite o nome do cômodo: ");
            String nomeComodo = scanner.next();

            System.out.print("Digite a largura do cômodo (metros): ");
            double largura = scanner.nextDouble();

            System.out.print("Digite o comprimento do cômodo (metros): ");
            double comprimento = scanner.nextDouble();

            // Calcular e apresentar a área do cômodo
            double areaComodo = largura * comprimento;
            System.out.println("Área do " + nomeComodo + ": " + areaComodo + " metros quadrados");

            // Atualizar a área total
            areaTotal += areaComodo;

            // Perguntar se o usuário deseja continuar
            System.out.print("Deseja calcular outro cômodo? (SIM/NAO): ");
            resposta = scanner.next().toUpperCase();

        } while (!resposta.equals("NAO"));

        // Apresentar a área total
        System.out.println("Área total da residência: " + areaTotal + " metros quadrados");

        scanner.close();
    }
}