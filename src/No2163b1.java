import java.util.Scanner;

public class No2163b1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(), M = scanner.nextInt();

        int [][] dp = new int[N + 1][M + 1];

        for(int i = 2 ; i <= M ; i++)
            dp[1][i] = dp[1][i - 1] + 1;

        for (int i = 2; i <= N; i++)
            dp[i][1] = dp[i - 1][1] + 1;

        for(int i = 2 ; i <= N ; i++) {
            for(int j = 2 ; j <= M ; j++)
                dp[i][j] = Math.min(dp[i - 1][j] + dp[i][j-1] + 1, dp[i][j - 1] + dp[i][1] + 1);
        }

        System.out.println(dp[N][M]);
    }
}
