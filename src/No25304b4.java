import java.util.*;

public class No25304b4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();

        for(int i = sc.nextInt() ; i > 0 ; i--)
            X -= sc.nextInt() * sc.nextInt();

        System.out.println(X == 0 ? "Yes" : "No");
    }
}
