import java.util.Scanner;

public class No1769s5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int num = 0;

        while(input.length() != 1) {
            int now = 0;
            for(int i = 0 ; i < input.length() ; i++)
                now += input.charAt(i) - '0';

            input = now+"";
            num++;
        }

        System.out.println(num + (Integer.parseInt(input)%3 == 0 ? "\nYES" : "\nNO"));
    }
}
