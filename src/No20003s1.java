import java.util.Scanner;

public class No20003s1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(), numerator[] = new int[N], denominator[] = new int[N], check[] = new int[51];

        for(int i = 0 ; i < N ; i++) {
            int a = scanner.nextInt(), b = scanner.nextInt();

            int gcd = gcd(a, b);

            a /= gcd;
            b /= gcd;

            numerator[i] = a;
            denominator[i] = b;

            for (int j = 2; j <= Math.sqrt(b); j++) {
                int now = 0;
                while (b % j == 0) {
                    now++;
                    b /= j;
                }
                check[j] = Math.max(check[j], now);
            }

            if (N != 1)
                check[b] = Math.max(check[b], 1);
        }

        int result = 1;

        for(int i = 2 ; i < 51 ; i++)
            if(check[i] != 0)
                result *= Math.pow(i, check[i]);

        System.out.println(result);
    }

    static int gcd(int a, int b) {
        if(b == 0)
            return a;
        return gcd(b, a % b);
    }
}
