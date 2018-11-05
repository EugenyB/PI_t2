import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main7289 {

    public static void main(String[] args) throws Exception {
        new Main7289().run();
    }

    private void run() throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s = in.readLine();
        int len = s.length();
        BigInteger result = BigInteger.ONE;
        for (int i=0; i<len; i++) {
            int d = s.charAt(i)-'0' + 1;
            result = result.multiply(BigInteger.valueOf(d));
        }
        System.out.println(result);
    }
}