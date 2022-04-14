/******************************************
 번호 : 1032
 문제 : 명령 프롬프트
 ******************************************/

import java.util.Scanner;

public class No1032 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        int n=s.nextInt(),m=0;
        char[][]a=new char[n][50];

        for(int i=0;i<n;i++) {
            String k=s.next();
            m=k.length();
            for(int j=0;j<m;j++) {
                a[i][j]=k.charAt(j);
                if(a[0][j]!=k.charAt(j)) a[0][j]='?';
            }
        }
        for(int i=0;i<m;i++) System.out.print(a[0][i]);
    }
}
