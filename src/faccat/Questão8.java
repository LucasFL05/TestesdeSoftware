package faccat;
import java.util.Scanner;

public class Questão8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número total de eleitores: ");
        int totalEleitores = sc.nextInt();

        System.out.print("Digite o número de votos brancos: ");
        int votosBrancos = sc.nextInt();

        System.out.print("Digite o número de votos nulos: ");
        int votosNulos = sc.nextInt();

        System.out.print("Digite o número de votos válidos: ");
        int votosValidos = sc.nextInt();

        double percentualBrancos = (votosBrancos * 100.0) / totalEleitores;
        double percentualNulos = (votosNulos * 100.0) / totalEleitores;
        double percentualValidos = (votosValidos * 100.0) / totalEleitores;

        System.out.println("Percentual de votos brancos: " + percentualBrancos + "%");
        System.out.println("Percentual de votos nulos: " + percentualNulos + "%");
        System.out.println("Percentual de votos válidos: " + percentualValidos + "%");

        sc.close();
    }
}
