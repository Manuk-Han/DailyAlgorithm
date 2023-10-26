/**
 좌표 2개를 입력 받고, 입력 받은 좌표 들과 (0,0) 좌표가 꼭짓점 으로 이루어진 삼각형의 넓이를 구해라.
각 좌표의 x와 y 축의 값은 정수이다.

조건 :
1. 각 좌표의 (x,y)의 법위는 0 <= x, y <= 500 이다.
2. 주어진 좌표 들로 삼각형을 만들 수 없다면 -1을 출력해라.
3. 출력은 정수라며 정수, 유리수이고 소수점 5자리 이상이라면 반올림 하시오.

입력 1
1 3
2 4

출력 1
7.33333

입력 2
123 321
41 14


출력 2
5719.5

입력 3
10 10
20 20

출력 3
-1
 **/

package dclab;

import java.util.Scanner;

public class problem02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        String result = convertNumberToString(n);
        System.out.println(result);
    }

    public static String convertNumberToString(int n) {
        if (n == 0) {
            return "a";
        }

        StringBuilder result = new StringBuilder();

        while (n > 0) {
            int remainder = n % 100;
            if (remainder > 26) {
                int firstDigit = remainder / 10;
                int secondDigit = remainder % 10;
                result.insert(0, (char) ('a' + secondDigit - 1));
                n = firstDigit;
            } else {
                result.insert(0, (char) ('a' + remainder - 1));
                n = n / 100;
            }
        }

        return result.toString();
    }
}
