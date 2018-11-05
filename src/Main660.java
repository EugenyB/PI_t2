import java.util.Scanner;


public class Main660 {

    public static void main(String[] args) {
        new Main660().run();
    }

    private void run() {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        for (int i = 0; i < a; i++) {
            int x1 = in.nextInt();
            int y1 = in.nextInt();
            int x2 = in.nextInt();
            int y2 = in.nextInt();
            System.out.print((x1+y1+x2+y2)%2);
        }
    }
}