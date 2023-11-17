package faccat;
import java.util.Scanner;

public class Questão32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do primeiro time: ");
        String time1 = sc.nextLine();

        System.out.print("Digite o nome do segundo time: ");
        String time2 = sc.nextLine();

        System.out.print("Digite o número de gols marcados pelo " + time1 + ": ");
        int golsTime1 = sc.nextInt();

        System.out.print("Digite o número de gols marcados pelo " + time2 + ": ");
        int golsTime2 = sc.nextInt();

        determinarVencedor(time1, golsTime1, time2, golsTime2);
    }

    private static void determinarVencedor(String time1, int golsTime1, String time2, int golsTime2) {
        if (golsTime1 > golsTime2) {
            System.out.println("O vencedor é o time " + time1 + ".");
        } else if (golsTime2 > golsTime1) {
            System.out.println("O vencedor é o time " + time2 + ".");
        } else {
            System.out.println("EMPATE! Ambos os times marcaram a mesma quantidade de gols.");
        }
    }
}
