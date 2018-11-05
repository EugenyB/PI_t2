import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main842 {

    public static void main(String[] args) {
        new Main842().run();
    }

    private void run() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = n;
        List<Integer> list = new ArrayList<>();
        int root = (int) Math.sqrt(n);
        for (int d=2; d<=root; d++) {
            int k = 0 ;
            while (m%d==0) {
                m/=d;
                k++;
                list.add(d);
            }
        }
        if (m>1) {
            list.add(m);
        }
        System.out.print(list.get(0));
        for (int i = 1; i < list.size(); i++) {
            System.out.print("*"+list.get(i));
        }
    }
}