import java.util.Scanner;

public class No10093b2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long A = scanner.nextLong(), B = scanner.nextLong(), a = Math.min(A, B), b = Math.max(A, B);

        System.out.println(b-a-1 > 0 ? b-a-1 : 0);

        for (long i = a + 1; i < b; i++)
            System.out.print(i + " ");
    }
}
