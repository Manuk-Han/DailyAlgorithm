import java.util.Scanner;

public class No2491s4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt(), now = scanner.nextInt();
        int count = 1, min = 1, max = 1;

        for(int i = 0 ; i < num-1 ; i++){
            int input = scanner.nextInt();

            min = input > now ? 1 : min+1;
            max = input < now ? 1 : max+1;
            now = input;

            count = Math.max(count, Math.max(min, max));
        }

        System.out.println(count);
    }
}
