import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main4824 {
    private boolean isPrime(long x) {
        if ((x == 0) || (x == 1)) return false;
        if ((x == 2) || (x == 3)) return true;
        if (x%2 == 0) return false;
        long kok = (long) Math.sqrt(x) + 1;
        for (long i = 3; i < kok; i += 2) {
            if (x%i == 0) return false;
        }
        return true;
    }

    private long nextPrime(long x) {
        if ((x == 0) || (x == 1)) return 2;
        if (x == 2) return 3;
        x = x%2 == 0 ? x + 1 : x + 2;
        for (long i = x; i < 45248; i += 2) {
            if (isPrime(i)) return i;
        }
        return 0;
    }

    private long factor(long n) {
        if (isPrime(n)) return n;
        long koren = (long) Math.sqrt(n) + 1;
        for (long i = 2; i <= koren; i = nextPrime(i)) {
            if (n%i == 0) return i;
        }
        return 0;
    }

    public static void main(String[] args) throws Exception{
        new Main4824().run();
    }

    private void run() {
        Scanner in = new Scanner(System.in);
        var n = in.nextLong();
        List<Long> list = new ArrayList<>();
        long current = n;
        while (current > 1) {
            long d = factor(current);
            list.add(d);
            current /= d;
        }
        System.out.println(list);
    }
}