/******************************************
 2022-05-12 (Thu)
 번호 : 15720
 문제 : 카우버거
 ******************************************/

import java.util.Arrays;
import java.util.Scanner;

public class No15720s5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int b = scanner.nextInt(), s = scanner.nextInt(), d = scanner.nextInt(), pay = 0;
        int bugger[] = new int[b], side[] = new int[s], drink[] = new int[d];

        for(int i = 0 ; i < b ; i++) pay += bugger[i] = scanner.nextInt();
        for(int i = 0 ; i < s ; i++) pay += side[i] = scanner.nextInt();
        for(int i = 0 ; i < d ; i++) pay += drink[i] = scanner.nextInt();

        System.out.println(pay);

        Arrays.sort(bugger);
        Arrays.sort(side);
        Arrays.sort(drink);

        int set = Math.min(Math.min(b, s), d);

        for(int i = b ; i > b-set ; i--) pay -= bugger[i-1]/10;
        for(int i = s ; i > s-set ; i--) pay -= side[i-1]/10;
        for(int i = d ; i > d-set ; i--) pay -= drink[i-1]/10;

        System.out.println(pay);
    }
}
