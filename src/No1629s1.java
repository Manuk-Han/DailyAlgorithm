import java.util.Scanner;

public class No1629s1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt(), B = scanner.nextInt(), C = scanner.nextInt();

        int result = 1;

        for(int i = B ; i > 0 ; ) {
            if(B % 2 == 1) {
                result *= A % C;
                result %= C;
                i--;
            } else {
                A = A * A % C;
                i /= 2;
            }
        }

        System.out.println((result * ( A % C)) % C);
    }
}
