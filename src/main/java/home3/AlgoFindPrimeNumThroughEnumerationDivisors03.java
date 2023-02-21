package home3;

public class AlgoFindPrimeNumThroughEnumerationDivisors03 {
    public static void main(String[] args) {
        System.out.println(getPrimeNumbers(100));
    }

    private static int getPrimeNumbers(int n) {
        var count = 0;
        var primes = new Long[n / 2];

        primes[count++] = 2L;

        for (var i = 3; i <= n; i++) {
            if (isPrime(primes, i)) {
                primes[count++] = (long) i;
            }
        }
        return count;
    }

    private static boolean isPrime(Long[] primes, int num) {
        var sqrt = Math.sqrt(num);

        for (var i = 0; primes[i] <= sqrt; i++) {
            if (num % primes[i] == 0) {
                return false;
            }
        }
        return true;
    }
}
