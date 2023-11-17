import java.util.*;

public class No1312 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int A = s.nextInt(), B = s.nextInt(), result = A % B;

        for(int i = s.nextInt(); i > 1 ; i--){
            result *= 10;
            result %= B;
        }

        System.out.println(result*10/B);
    }
}
