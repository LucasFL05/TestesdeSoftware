package manzano;
public class Pg45Questao_G {
    public static void main(String[] args) {
        int termoAnterior = 1;
        int termoAtual = 1;

        System.out.println("Série de Fibonacci até o décimo quinto termo:");
        System.out.print(termoAnterior + ", " + termoAtual);

        for (int i = 3; i <= 15; i++) {
            int proximoTermo = termoAnterior + termoAtual;
            System.out.print(", " + proximoTermo);

            termoAnterior = termoAtual;
            termoAtual = proximoTermo;
        }
    }
}