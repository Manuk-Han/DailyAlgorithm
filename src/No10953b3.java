import java.util.Scanner;

public class No10953b3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        for(int i = 0 ; i < T ; i++) {
            String[] input = scanner.next().split(",");
            System.out.println(Integer.parseInt(input[0]) + Integer.parseInt(input[1]));
        }
    }
}
