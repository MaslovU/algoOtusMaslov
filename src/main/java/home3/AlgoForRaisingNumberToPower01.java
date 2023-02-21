package home3;

public class AlgoForRaisingNumberToPower01 {
    public static void main(String[] args) {
        int a = 3;
        int N = 10;
        int d = a;
        int p = 1;

        while (N >= 1) {
            N = N / 2;
            d = d * d;
            if (N % 2 == 1) {
                p = p * d;
            }
        }

        System.out.println(p);
    }
}
