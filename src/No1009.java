/******************************************
 번호 : 1009
 문제 : 분산처리
 ******************************************/

import java.util.Scanner;

public class No1009 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        for(int i = s.nextInt() ; i > 0 ; i--) {

            int a = s.nextInt() % 10, b = s.nextInt() % 4, k = a;

            for(int j = 1 ; j < b+4 ; j++) k = k * a % 10;

            System.out.println(k > 0 ? k:10);
        }
    }
}
