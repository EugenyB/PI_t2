import java.util.Scanner;

public class Main11 {

    public static void main(String[] args) {
        new Main11().run();
    }

    private void run() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int k = in.nextInt();
        System.out.print(n / m + ".");
        n %= m;
        for (int i = 0; i < k; i++) {
            n *=10;
            System.out.print(n / m);
            n %= m;
        }
        System.out.println();
    }
}