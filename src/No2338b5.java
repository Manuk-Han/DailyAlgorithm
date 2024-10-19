import java.math.BigInteger;
import java.util.Scanner;

public class No2338b5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String A = scanner.next(), B = scanner.next();

        BigInteger bigA = new BigInteger(A);
        BigInteger bigB = new BigInteger(B);

        System.out.println(bigA.add(bigB));
        System.out.println(bigA.subtract(bigB));
        System.out.println(bigA.multiply(bigB));
    }
}
