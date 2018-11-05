import java.util.Scanner;

public class Main123 {
    public static void main(String[] args) {
        new Main123().run();
    }

    private void run() {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long k = 0;
        long d = 5;
        while (n>=d) {
            k+=(n/d);
            d*=5;
        }
        System.out.println(k);
    }
}