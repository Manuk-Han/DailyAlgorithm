import java.math.BigInteger;
import java.util.Scanner;

public class No1500s2 {
    public static void main(String[] args) {
        Scanner scanner = new java.util.Scanner(System.in);

        int k = scanner.nextInt(), s = scanner.nextInt();

        BigInteger result = BigInteger.ONE;

        int small = k / s, big = k / s + 1;

        for(int i = 0 ; i < s - k % s ; i++)
            result = result.multiply(BigInteger.valueOf(small));

        for(int i = 0 ; i < k % s ; i++)
            result = result.multiply(BigInteger.valueOf(big));

        System.out.println(result);
    }
}
