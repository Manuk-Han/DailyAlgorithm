import java.util.Scanner;

public class No2553s2 {
    public static void main(String[] args) {
        int N = new Scanner(System.in).nextInt(), dp[] = new int[20001];

        dp[0] = dp[1] = 1;
        dp[2] = 2;
        dp[3] = 6;
        dp[4] = 4;

        for (int i = 5; i <= N; i++) {
            if (i % 5 == 0) {
                int q = i / 5;
                dp[i] = ((int) Math.pow(2, q % 4) * dp[q]) % 10;
            } else {
                int before = (i / 5) * 5, total = 1;
                for (int j = i; j > before; j--) total *= (j % 10);

                total *= dp[before];
                dp[i] = total % 10;
            }
        }

        System.out.println(dp[N]);
    }
}
