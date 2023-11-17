package faccat;
import java.util.Scanner;

public class Questão34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de x: ");
        int x = sc.nextInt();

        System.out.print("Digite o valor de y: ");
        int y = sc.nextInt();

        int z = x * y + 5;

        char resposta;

        if (z > 100) {
            resposta = 'A';
        } else {
            resposta = 'B';
        }

        System.out.println("Resposta: " + resposta);

        sc.close();

        System.out.println("\nTeste de Mesa:\n");

        int[] valoresX = {3, 150, 7, -2, 50};
        int[] valoresY = {2, 3, -1, 5, 3};

        // loop para percorrer os valores e calcular z e a resposta
        for (int i = 0; i < valoresX.length; i++) {
            x = valoresX[i];
            y = valoresY[i];

            // calcular z
            z = x * y + 5;

            // resposta com base em z
            resposta = (z > 100) ? 'A' : 'B';

            // resultados do teste de mesa
            System.out.println("Para x = " + x + " e y = " + y + ":");
            System.out.println("  z = " + z);
            System.out.println("  Resposta = " + resposta);
            System.out.println(); //linha em branco para separar os resultados
        }
    }
}
