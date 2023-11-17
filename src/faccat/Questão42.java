package faccat;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class Questão42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número do empregado (código): ");
        int codigoEmpregado = sc.nextInt();

        System.out.print("Digite o ano de nascimento do empregado: ");
        int anoNascimento = sc.nextInt();

        System.out.print("Digite o ano de ingresso na empresa do empregado: ");
        int anoIngresso = sc.nextInt();

        int idade = calcularIdade(anoNascimento);

        int tempoTrabalho = LocalDate.now().getYear() - anoIngresso;

        System.out.println("Idade do empregado: " + idade + " anos");
        System.out.println("Tempo de trabalho do empregado: " + tempoTrabalho + " anos");

        if (idade >= 65 || tempoTrabalho >= 30 || (idade >= 60 && tempoTrabalho >= 25)) {
            System.out.println("Requerer aposentadoria");
        } else {
            System.out.println("Não requerer aposentadoria");
        }

        sc.close();
    }

    private static int calcularIdade(int anoNascimento) {
        return LocalDate.now().getYear() - anoNascimento;
    }
}
