package home3;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

import static java.lang.System.out;

public class AlgoFindPrimeNumThroughEratosfen {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        List res = findPrimeNum(10000);
        out.println(res.size());
        out.println(System.currentTimeMillis() - time);
    }

    private static List<Integer> findPrimeNum(int n) {
        var sieve = new BitSet(n);
        sieve.set(0, n - 1, true);
        sieve.set(0, false);
        sieve.set(1, false);
        for (int i = 2; i * i < sieve.length(); i++) {
            if (sieve.get(i)) {
                for (int j = i * i; j < sieve.length(); j += i) {
                    sieve.set(j, false);
                }
            }
        }

        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i < sieve.length(); i++) {
            if (sieve.get(i)) {
                primes.add(i);
            }
        }
        return primes;
    }
}
