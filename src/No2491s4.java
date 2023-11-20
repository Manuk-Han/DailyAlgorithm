import java.util.*;

public class No2491s4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int now, input = 0, count = 1, min = 1, max = 0;

        for(int i = s.nextInt(); i > 0 ; i--){
            now = input;
            input = s.nextInt();

            min = input > now ? 1 : min+1;
            max = input < now ? 1 : max+1;

            count = Math.max(count, Math.max(min, max));
        }

        System.out.print(count);
    }
}
