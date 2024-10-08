import java.util.Scanner;

public class No3135s5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt(), B = scanner.nextInt(), N = scanner.nextInt(), min = Math.abs(B - A);

        for(int i = 0 ; i < N ; i++) {
            int C = scanner.nextInt();
            min = Math.min(min, Math.abs(B - C)+1);
        }

        System.out.println(min);
    }
}
