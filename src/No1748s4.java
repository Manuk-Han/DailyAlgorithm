import java.util.Scanner;

public class No1748s4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int length = String.valueOf(N).length(), result = length * N;

        for(int i = 1 ; i < length ; i++)
            result -= Integer.parseInt("9".repeat(i));

        System.out.println(result);
    }
}
