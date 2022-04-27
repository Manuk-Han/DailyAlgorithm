/******************************************
 2022-04-27 (Wed)
 번호 : 1934
 문제 : 최소공배수
 ******************************************/

import java.util.Scanner;

public class No1934s5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i = n;i>0;i--) {
            int a = scanner.nextInt(), b = scanner.nextInt(), x = a, y = b;
            while(true) {
                if( x == 1 || y == 1) {
                    x = 1;
                    break;
                }
                if(x > y) x -= y;
                else if(x < y) y -= x;
                else break;
            }
            System.out.println(a * (b/x));
        }
    }
}