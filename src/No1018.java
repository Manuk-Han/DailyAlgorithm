/******************************************
 번호 : 1018
 문제 : 체스판 다시 칠하기
 ******************************************/

import java.util.Scanner;

public class No1018 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);

        int y=s.nextInt(),x=s.nextInt(),min=2500;
        boolean[][]b=new boolean[y][x];
        boolean[][]t=new boolean[y][x];

        for(int i=0;i<y;i++) {
            String str=s.next();
            for(int j=0;j<x;j++) {
                if(str.charAt(j)=='B') b[i][j]=true;
                if((i+j)%2==0) t[i][j]=true;
            }
        }

        for(int i=0;i<=y-8;i++) {
            for(int j=0;j<=x-8;j++) {
                int nt=0,nf=0;
                for(int p=0;p<8;p++) {
                    for(int q=0;q<8;q++) {
                        if(b[i+p][j+q]!=t[i+p][j+q]) nt++;
                        if(b[i+p][j+q]!=!t[i+p][j+q]) nf++;
                    }
                }
                if(nt<=min) min=nt;
                if(nf<=min) min=nf;
            }
        }
        System.out.print(min);
    }
}
