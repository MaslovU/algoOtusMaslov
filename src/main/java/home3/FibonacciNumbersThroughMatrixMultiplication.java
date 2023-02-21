package home3;

import java.math.BigInteger;

//алгоритм поиска чисел Фибоначчи O(LogN) через умножение матриц
public class FibonacciNumbersThroughMatrixMultiplication {
    public static void main(String[] args) {
        System.out.println(Fibbonacci.getFibonacciNumber(6));
    }
}

class Fibbonacci {
    public static BigInteger[][] makeMatrixMultiplication(BigInteger[][] a, BigInteger[][] b) {
        return new BigInteger[][]{
                {a[0][0].multiply(b[0][0]).add(a[0][1].multiply(b[1][0])), a[0][0].multiply(b[0][1]).add(a[0][1].multiply(b[1][1]))},
                {a[1][0].multiply(b[0][0]).add(a[1][1].multiply(b[1][0])), a[1][0].multiply(b[0][1]).add(a[1][1].multiply(b[1][1]))},
        };
    }

    public static BigInteger[][] makeMatrixPowerFast(BigInteger[][] a, int n) {
        if (n == 0) {
            // любая матрица в нулевой степени равна единичной матрице
            return new BigInteger[][]{
                    {BigInteger.ONE, BigInteger.ZERO},
                    {BigInteger.ZERO, BigInteger.ONE}
            };
        } else if (n % 2 == 0) {
            // a ^ (2k) = (a ^ 2) ^ k
            return makeMatrixPowerFast(makeMatrixMultiplication(a, a), n / 2);
        } else {
            // a ^ (2k + 1) = (a) * (a ^ 2k)
            return makeMatrixMultiplication(makeMatrixPowerFast(a, n - 1), a);
        }
    }

    public static BigInteger getFibonacciNumber(int n) {
        if (n == 0) {
            return BigInteger.ZERO;
        }

        BigInteger[][] a = {
                {BigInteger.ONE, BigInteger.ONE},
                {BigInteger.ONE, BigInteger.ZERO}
        };
        BigInteger[][] powerOfA = makeMatrixPowerFast(a, n - 1);
        BigInteger nthFibonacci = powerOfA[0][0];
        return nthFibonacci;
    }
}
