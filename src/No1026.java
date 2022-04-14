/******************************************
 번호 : 1026
 문제 : 보물
 ******************************************/

import java.util.Arrays;
import java.util.Scanner;

public class No1026 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        int n=s.nextInt(),a[]=new int[n],b[]=new int[n],m=0;
        for(int i=0;i<n;i++) a[i]=s.nextInt();
        for(int i=0;i<n;i++) b[i]=s.nextInt();

        Arrays.sort(a);
        Arrays.sort(b);

        for(int i=0;i<n;i++) m+=a[i]*b[n-1-i];

        System.out.print(m);
    }
}
