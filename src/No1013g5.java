import java.util.*;
import java.util.regex.*;

public class No1013g5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        for(int i = s.nextInt() ; i > 0 ; i--)
            System.out.println(Pattern.matches("(100+1+|01)+", s.next()) ? "YES" : "NO");
    }
}
