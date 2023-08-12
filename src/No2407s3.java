import java.math.BigInteger;
import java.util.Scanner;

public class No2407s3 {
    public static BigInteger countCombinations(int n, int k) {
        BigInteger[][] dp = new BigInteger[n + 1][k + 1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= Math.min(i, k); j++) {
                if (j == 0 || j == i) {
                    dp[i][j] = BigInteger.ONE;
                } else {
                    dp[i][j] = dp[i - 1][j - 1].add(dp[i - 1][j]);
                }
            }
        }

        return dp[n][k];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(), m = scanner.nextInt();

        BigInteger comb = countCombinations(n, m);

        System.out.println(comb);
    }
}
