package faccat;
import java.util.Scanner;

public class Questão22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de horas trabalhadas em um mês: ");
        double horasTrabalhadas = sc.nextDouble();

        System.out.print("Digite o salário por hora: ");
        double salarioPorHora = sc.nextDouble();

        double jornadaSemanal = 40;
        double semanasNoMes = 4;

        double salarioTotal;

        if (horasTrabalhadas <= jornadaSemanal * semanasNoMes) {
            salarioTotal = horasTrabalhadas * salarioPorHora;
        } else {
            double horasExtras = horasTrabalhadas - jornadaSemanal * semanasNoMes;
            salarioTotal = (jornadaSemanal * semanasNoMes * salarioPorHora) + (horasExtras * 1.5 * salarioPorHora);
        }

        System.out.println("O salário total do funcionário é: R$ " + salarioTotal);

        sc.close();
    }
}
