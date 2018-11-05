import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

import static java.lang.Math.sqrt;

public class Main3662 {

    static final int MAX = 1001;
    static int[] primes;

    static int[] genPrimes() {
        boolean[] primes = new boolean[MAX];
        primes[0] = primes[1] = false;
        for (int i = 2; i < MAX; i++) primes[i] = true;
        int K = (int) sqrt(1.0 * MAX);
        int p = 0;
        int[] res = new int[5133];
        for (int i = 2; i <= K; i++) {
            if (primes[i]) {
                res[p++] = i;
                for (int j = i * i; j < MAX; j += i) primes[j] = false;
            }
        }
        for (int i = K+1; i < MAX; i++) {
            if (primes[i]) res[p++] = i;
        }
        return Arrays.copyOf(res, p);
    }

    public static void main(String[] args) throws Exception{
        primes = genPrimes();
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        System.out.println(test(n));
    }

    private static long test(int n) {
        int[] p = new int[primes.length];
        for (int i = 0; i < primes.length; i++) {
            int d = primes[i];
            while (n>=d) {
                p[i] += n / d;
                d *= primes[i];
            }
        }
        long result = 1;
        for (int i = 0; i < p.length; i++) {
            result = (result * (p[i]+1)) % 1_000_000_009;
        }
        return result;
    }
}
