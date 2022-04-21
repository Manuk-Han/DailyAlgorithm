/******************************************
 2022-04-21 (Thu)
 번호 : 2217
 문제 : 로프
 ******************************************/

import java.util.*;

public class No2217s4{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n=scanner.nextInt();
        int a[] = new int[n], m = 0;

        for(int i = 0 ; i < n ; i++) a[i] = scanner.nextInt();
        Arrays.sort(a);

        for(int i = 0 ; i < n ; i++) m = Math.max((n - i) * a[i], m);
        System.out.print(m);
    }
}