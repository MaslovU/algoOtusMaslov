package home3;

//итеративный O(N) алгоритм поиска чисел Фибоначчи
public class IterativeAlgorithmFindingFibonacciNumbers {
    public static void main(String[] args) {
        System.out.println(findFibbonacci(6));
    }

    private static long findFibbonacci(int n) {
        int a = 1;
        int b = 1;
        int f = 0;

        for (int i = 3; i <= n; i++) {
            f = a + b;
            a = b;
            b = f;
        }

        return f;
    }
}
