/******************************************
 2022-05-10 (Tue)
 번호 : 1735
 문제 : 분수합
 ******************************************/

import java.util.Scanner;

public class No1735s3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ca = scanner.nextInt(), pa = scanner.nextInt(), cb = scanner.nextInt(), pb = scanner.nextInt();
        int child = ca*pb + cb*pa, parent = pa*pb, gcd = gcd(parent, child);

        System.out.print(child/gcd + " " + parent/gcd);
    }

    public static int gcd(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return gcd(b, a%b);
    }
}
