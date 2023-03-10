package home3;

//алгоритм возведения в степень через домножение O(N/2+LogN) = O(N)
public class ExponentiationThroughMultiplication11 {
    public static void main(String[] args) {
        System.out.println(makeMultiplication(2, 8));
    }

    private static long makeMultiplication(int value, int powValue) {
        if (powValue == 1) {
            return value;
        } else {
            return value * makeMultiplication(value, powValue - 1);
        }
    }
}
