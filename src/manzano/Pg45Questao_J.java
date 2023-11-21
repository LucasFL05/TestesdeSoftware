package manzano;
public class Pg45Questao_J {
    public static void main(String[] args) {
        int inicioFaixa = 50;
        int fimFaixa = 70;

        int somatorio = 0;
        int quantidadePares = 0;

        for (int i = inicioFaixa; i <= fimFaixa; i++) {
            if (i % 2 == 0) {
                somatorio += i;
                quantidadePares++;
            }
        }

        double media = (double) somatorio / quantidadePares;

        System.out.println("Soma dos valores pares na faixa de 50 a 70: " + somatorio);
        System.out.println("Média aritmética dos valores pares: " + media);
    }
}