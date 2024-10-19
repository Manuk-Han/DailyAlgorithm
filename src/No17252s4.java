import java.util.*;

public class No17252s4 {
    public static void main(String[] args) {
        String input = Integer.toString(new Scanner(System.in).nextInt(), 3);

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
