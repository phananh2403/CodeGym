package optional;

import static optional.FindPrimeNumbers.NUMBER_MAX;

public class LazyPrimeFactorization extends Thread{

    public void run() {
        for (int i = 0; i < NUMBER_MAX; i++) {
            if (isPrimeNumberLz(i))
                System.out.println("Lazy Prime Factorization: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static boolean isPrimeNumberLz(int n) {
        // so nguyen n < 2 khong phai la so nguyen to
        if (n < 2) {
            return false;
        }
        // check so nguyen to khi n >= 2
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
