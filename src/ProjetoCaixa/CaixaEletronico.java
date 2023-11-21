package ProjetoCaixa;

import java.util.Scanner;

public class CaixaEletronico {

    private static double saldo = 1000.0; //saldo existente

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;

        System.out.println("Caixa Eletronico Unipaulistana");

        while (continuar) {
            exibirMenu();
            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Você escolheu a opção Abastecimento.");
                    System.out.print("Digite o valor para abastecer: ");
                    double valorAbastecimento = sc.nextDouble();

                    if (realizarAbastecimento(valorAbastecimento)) {
                        System.out.println("Abastecimento de R$" + valorAbastecimento + " realizado com sucesso.");
                    } else {
                        System.out.println("Erro ao abastecer. Verifique o valor inserido.");
                    }
                    break;
                case 2:
                    System.out.println("Você escolheu a opção Consultar Saldo.");
                    System.out.println("Seu saldo é: R$" + saldo);
                    break;
                case 3:
                    System.out.println("Você escolheu a opção Saque.");
                    System.out.print("Digite o valor para sacar: ");
                    double valorSaque = sc.nextDouble();

                    if (realizarSaque(valorSaque)) {
                        System.out.println("Saque de R$" + valorSaque + " realizado com sucesso.");
                    } else {
                        System.out.println("Erro ao sacar. Verifique o valor inserido ou saldo insuficiente.");
                    }
                    break;
                case 4:
                    System.out.println("Saindo do caixa eletrônico.");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        sc.close();
    }

    private static void exibirMenu() {
        System.out.println("");
        System.out.println("1- Abastecimento");
        System.out.println("2 - Consultar Saldo");
        System.out.println("3 - Saque");
        System.out.println("4 - Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static boolean realizarAbastecimento(double valor) {
        if (valor > 0) {
            saldo += valor;
            return true;
        }
        return false;
    }

    private static boolean realizarSaque(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            return true;
        }
        return false;
    }
}
