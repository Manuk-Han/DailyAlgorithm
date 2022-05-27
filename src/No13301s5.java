/******************************************
 2022-05-26 (Fri)
 번호 : 13301
 문제 : 타일 장식물
 ******************************************/

import java.math.BigInteger;
import java.util.Scanner;

public class No13301s5 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        BigInteger[] dp = new BigInteger[n+1];

        dp[0] = dp[1] = new BigInteger("1");
        for(int i = 2 ; i < n ; i++)
            dp[i] = dp[i-2].add(dp[i-1]);

        BigInteger sum = new BigInteger("4");
        for(int i = 1 ; i < n ; i++)
            sum = sum.add(dp[i]).add(dp[i]);

        System.out.print(sum);
    }
}
