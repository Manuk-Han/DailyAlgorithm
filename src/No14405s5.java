/******************************************
 2022-04-20 (Wed)
 번호 : 14405
 문제 : 피카츄
 ******************************************/


import java.util.*;

public class No14405s5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();
        input = input.replace("pi", "1");
        input = input.replace("ka", "1");
        input = input.replace("chu", "1");

        for(char c : input.toCharArray()) {
            if (c != '1') {
                System.out.print("NO");
                return;
            }
        }
        System.out.print("YES");
    }
}
