import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main4739 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(IntStream.rangeClosed(Math.max(in.nextInt(), 2), in.nextInt())
                .filter(t -> IntStream.range(2, (int) Math.sqrt(t) + 1).noneMatch(d -> t % d == 0))
                .mapToObj(Integer::toString)
                .collect(Collectors.joining(" ")));
    }
}