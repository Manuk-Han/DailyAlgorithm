import java.util.*;

public class No2566b1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        int n=0,m=0,k;

        for(int i=0;i<81;i++){
            if ((k = s.nextInt()) > m) {
                m = k;
                n = i;
            }
        }

        System.out.print(m + "\n" + (n/9+1) + " " + (n%9+1));
    }
}
