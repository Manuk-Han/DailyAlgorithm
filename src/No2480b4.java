/******************************************
 2022-05-09 (Mon)
 번호 : 2480
 문제 : 주사위 세개
 ******************************************/

import java.util.Scanner;

public class No2480b4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] check = new int[6];
        for(int i = 0 ; i < 3 ; i++) check[scanner.nextInt()-1]++;

        int n = 0, max = 0;
        for(int i = 0 ; i < 6 ; i++){
            if(check[i] >= n){
                n = check[i];
                max = i+1;
            }
        }

        if(n != 1) max = max+10;
        System.out.print(n == 3 ? max*1000 : max*100);
    }
}
