import java.util.Scanner;

public class No3058b3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        for(int i = 0 ; i < T ; i++) {
            int sum = 0, min = 101;

            for(int j = 0 ; j < 7 ; j++) {
                int N = scanner.nextInt();

                if(N % 2 == 0) {
                    sum += N;
                    min = Math.min(min, N);
                }
            }

            System.out.println(sum + " " + min);
        }
    }
}
