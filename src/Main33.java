import java.util.Scanner;

public class Main33 {

    public static void main(String[] args) {
        new Main33().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a>b){
            int c = a; a=b; b=c;
        }
        int k=0;
        for (int i = a; i<=b; i++){
            boolean res = proverka(i);
            if(res){
                boolean like = proverka2(i);
                if (like){
                    k++;
                }
            }
        }
        System.out.println(k);
    }

    private boolean proverka2(int i) {
        String c = String.valueOf(i);
        return !c.contains("13");
    }

    private boolean proverka(int s) {
        if (s==1){
            return false;
        }
        int c = (int) Math.sqrt(s);
        for ( int i = 2; i<=c; i++){
            int ost = s%i;
            if (ost==0){
                return false;
            }
        }
        return true;
    }
}