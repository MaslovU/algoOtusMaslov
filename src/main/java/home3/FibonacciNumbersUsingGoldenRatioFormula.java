package home3;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

//Реализовать алгоритм поиска чисел Фибоначчи по формуле золотого сечения
public class FibonacciNumbersUsingGoldenRatioFormula {

    private static final MathContext _mc = new MathContext(20, RoundingMode.HALF_UP);
    private static final double _sqrt5 = Math.sqrt(5);
    public static final BigDecimal Sqrt5 = new BigDecimal(_sqrt5, _mc);
    public static final BigDecimal Phi = new BigDecimal((1 + _sqrt5) / 2, _mc);

    public static void main(String[] args) {
        System.out.println(estimate(10).intValue());
    }

    public static BigDecimal estimate(int n) {
        return Phi.pow(n, _mc).divide(Sqrt5, _mc);
    }
}
