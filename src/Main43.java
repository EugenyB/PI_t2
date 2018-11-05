import java.util.Scanner;

/**
 *
 * @author Eugeny
 */
public class Main43 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Main43().run();
    }

    private void run() {
        Scanner in = new Scanner(System.in);
        long k = in.nextInt();
        long m = in.nextInt();
        long n = in.nextInt();
        long d = in.nextInt();
        long ch = k*m + k*n + m*n;
        long zn = k*m*n;
        if (ch>=zn) {
            System.out.println("-1");
        } else {
            ch = zn - ch;
            if (d * zn % ch != 0) {
                System.out.println("-1");
            } else {
                System.out.println(d*zn/ch);
            }
        }
    }
}