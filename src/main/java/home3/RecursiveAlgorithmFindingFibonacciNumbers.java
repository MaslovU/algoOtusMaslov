package home3;

//рекурсивный O(2^N) алгоритм поиска чисел Фибоначчи
public class RecursiveAlgorithmFindingFibonacciNumbers {
    public static void main(String[] args) {
        System.out.println(findFibonacci(6));
    }

    private static long findFibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        return findFibonacci(n - 1) + findFibonacci( n- 2);
    }
}
