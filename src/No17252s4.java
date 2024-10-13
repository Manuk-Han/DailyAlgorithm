import java.util.Scanner;

public class No17252s4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = Integer.toString(scanner.nextInt(), 3);

        if(input.equals("0")) {
            System.out.println("NO");
            return;
        }

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '2') {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
