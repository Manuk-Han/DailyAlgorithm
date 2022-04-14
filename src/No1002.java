/******************************************
 번호 : 1002
 문제 : 터렛
 ******************************************/

import java.util.Scanner;

public class No1002 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);

        for(int i=s.nextInt();i>0;i--) {
            int x1=s.nextInt(),y1=s.nextInt(),r1=s.nextInt(),n=0;
            int x=x1-s.nextInt(),y=y1-s.nextInt(),r2=s.nextInt(),r=r1>r2?r1-r2:r2-r1;
            double d=Math.sqrt(x*x+y*y);

            if(d==0 && r==0) {
                System.out.println(-1);
                continue;
            }
            if(d==r1+r2) n=1;
            else if(d<r1+r2) {
                if(d>=r1&&d>=r2) n=2;
                else if(d==r) n=1;
                else if(d<r) n=0;
                else n=2;
            }
            else n=0;
            System.out.println(n);
        }
    }
}
