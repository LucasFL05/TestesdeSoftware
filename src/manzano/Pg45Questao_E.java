package manzano;
public class Pg45Questao_E {
    public static void main(String[] args) {
        for (int expoente = 0; expoente <= 15; expoente++) {
            long resultado = calcularPotenciaDe3(expoente);
            System.out.println("3^" + expoente + " = " + resultado);
        }
    }

    // Método para calcular a potência de 3 sem usar o operador de exponenciação
    private static long calcularPotenciaDe3(int expoente) {
        long resultado = 1;

        for (int i = 0; i < expoente; i++) {
            resultado *= 3;
        }

        return resultado;
    }
}