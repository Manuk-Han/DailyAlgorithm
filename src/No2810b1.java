/******************************************
 2022-05-09 (Mon)
 번호 : 2810
 문제 : 컵홀더
 ******************************************/


import java.util.Scanner;

public class No2810b1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        String seat = scanner.next();
        seat = seat.replace("LL", "S");

        System.out.print(Math.min(n, seat.length()+1));
    }
}
