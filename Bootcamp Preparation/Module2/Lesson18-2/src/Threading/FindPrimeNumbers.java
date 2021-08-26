package optional;

public class FindPrimeNumbers {
    public static final int NUMBER_MAX = 100;

    public static void main(String[] args) {
        LazyPrimeFactorization lazyP = new LazyPrimeFactorization();
        OptimizedPrimeFactorization optimizedP = new OptimizedPrimeFactorization();

        lazyP.start();
        optimizedP.start();
    }

}
