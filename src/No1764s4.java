/******************************************
 2022-04-25 (Mon)
 번호 : 1764
 문제 : 듣보잡
 ******************************************/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class No1764s4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(), m = scanner.nextInt();
        String a[] = new String[n+m];
        ArrayList<String> l=new ArrayList();

        for(int i = 0 ; i < n+m ; i++) a[i] = scanner.next();
        Arrays.sort(a);
        for(int i = 0 ; i < n+m-1 ; i++)
            if(a[i].equals(a[i+1])) l.add(a[i++]);

        System.out.println(l.size());
        for(String k:l) System.out.println(k);
    }
}

