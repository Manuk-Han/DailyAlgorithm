import java.util.Scanner;

public class No1629s1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long A = scanner.nextInt(), B = scanner.nextInt(), C = scanner.nextInt();

        long remain = 1;
        while(B > 0) {
            if (B % 2 == 1) {
                B--;
                remain *= A;
                remain %= C;
            }

            A = (A * A) % C;
            B /= 2;
        }

        System.out.println(remain % C);
    }
}
