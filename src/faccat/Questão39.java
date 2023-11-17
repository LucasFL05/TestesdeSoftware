package faccat;
public class Questão39 {
    public static void main(String[] args) {
        boolean A = true;
        boolean B = true;
        boolean C = false;

        boolean expressaoA = (A && B) || (A ^ B);
        boolean expressaoB = (A || B) && (A && C);
        boolean expressaoC = A || (C && B) ^ (A && !B);

        System.out.println("a) (A e B) ou (A xou B): " + expressaoA);
        System.out.println("b) (A ou B) e (A e C): " + expressaoB);
        System.out.println("c) A ou C e B xou A e não B: " + expressaoC);
    }
}
