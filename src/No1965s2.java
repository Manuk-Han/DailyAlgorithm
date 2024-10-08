import java.util.Scanner;

public class No1965s2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int[] arr = new int[1001];

        for(int i = 1 ; i <= N ; i++)
            arr[scanner.nextInt()] = i;

        int[] dp = new int[1001];
        dp[1] = 1;

        for(int i = 1 ; i < 1001 ; i++) {

        }
    }
}
