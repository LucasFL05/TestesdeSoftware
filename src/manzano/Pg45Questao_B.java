package manzano;
public class Pg45Questao_B {
    public static void main(String[] args) {
        int soma = 0;

        for (int i = 1; i <= 100; i++) {
            soma += i;
        }

        System.out.println("Total da soma dos cem primeiros números inteiros: " + soma);
    }
}