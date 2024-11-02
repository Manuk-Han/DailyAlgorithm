import java.util.Scanner;

public class No10810b3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int []arr = new int[scanner.nextInt()];
        int m = scanner.nextInt();

        for(int i = 0; i < m; i++) {
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            int num = scanner.nextInt();

            for(int j = start - 1; j < end; j++)
                arr[j] = num;
        }

        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}
