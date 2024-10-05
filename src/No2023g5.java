import java.util.Scanner;

public class No2023g5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        dfs(2, 1, N);
        dfs(3, 1, N);
        dfs(5, 1, N);
        dfs(7, 1, N);
    }

    static void dfs(int num, int numLen, int maxLen) {
        if (numLen == maxLen) {
            if (isPrime(num))
                System.out.println(num);
        }

        for (int i = 1; i < 10; i += 2) {
            if (isPrime(num * 10 + i))
                dfs(num * 10 + i, numLen + 1, maxLen);
        }
    }

    static boolean isPrime(int num) {
        for(int i = 2 ; i <= Math.sqrt(num) ; i++) {
            if (num % i == 0)
                return false;
        }

        return true;
    }
}
