import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main1904 {
    public static void main(String[] args) {
        new Main1904().run();
    }

    private void run() {
        Scanner in = new Scanner(System.in);
        boolean[] resheto = new boolean[1_000_001];
        Arrays.fill(resheto, true);
        resheto[0] = resheto[1] = false;

        for(int i=2; i<resheto.length; i++) {
            if (resheto[i]) {
                for (int j = 2 * i; j < resheto.length; j += i) {
                    resheto[j] = false;
                }
            }
        }
        List<Integer> primes = new ArrayList<>();
        for (int i = 0; i < resheto.length; i++) {
            if (resheto[i]) {
                primes.add(i);
            }
        }
        int t = in.nextInt();
        while (t-->0) {
            int res = 0;
            long n = in.nextLong();

            for (Integer prime : primes) {
                if (prime>n) break;
                int k = 0;
                while (n%prime == 0) {
                    n /= prime;
                    k++;
                }
                if (k>res) res = k;
            }
            if (n==1) {
                System.out.println(res);
            } else
            if (isSQ(n)) {
                System.out.println(Math.max(res, 2));
            } else  {
                System.out.println(Math.max(res,1));
            }

        }
    }

    private boolean isSQ(long n) {
        long r = Math.round(Math.sqrt(n));
        return r*r == n;
    }
}