import java.util.Scanner;

public class No31868b3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(), K = scanner.nextInt();

        System.out.println((int)(K/Math.pow(2, N-1)));
    }
}
