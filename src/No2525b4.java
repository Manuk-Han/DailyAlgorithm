/******************************************
 2022-05-09 (Mon)
 번호 : 2525
 문제 : 오븐 시계
 ******************************************/

import java.util.Scanner;

public class No2525b4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h = scanner.nextInt(), m = scanner.nextInt() + scanner.nextInt();

        System.out.print((h+m/60)%24 + " " + m%60);
    }
}
