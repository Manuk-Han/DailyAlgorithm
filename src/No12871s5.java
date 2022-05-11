/******************************************
 2022-04-11 (Wed)
 번호 : 12871
 문제 : 무한 문자열
 ******************************************/


import java.util.Scanner;

public class No12871s5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.next(), t = scanner.next();

        System.out.print(s.repeat(t.length()).equals(t.repeat(s.length())) ? 1 : 0);
    }
}
