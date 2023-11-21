package manzano;
public class Pg45Questao_H {
    public static void main(String[] args) {
        System.out.println("Celsius   |   Fahrenheit");
        System.out.println("------------------------");

        for (int celsius = 10; celsius <= 100; celsius += 10) {
            double fahrenheit = converterParaFahrenheit(celsius);
            System.out.printf("%-9d |   %-9.2f\n", celsius, fahrenheit);
        }
    }

    // Método para converter Celsius para Fahrenheit
    private static double converterParaFahrenheit(int celsius) {
        return (9.0 * celsius + 160.0) / 5.0;
    }
}