/******************************************
 2022-04-28 (Thu)
 번호 : 1924
 문제 : 2007년
 ******************************************/

import java.util.Scanner;

public class No1924b1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int m[]= {0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
        String d[]= {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

        System.out.print(d[(m[scanner.nextInt() - 1] + scanner.nextInt()) % 7]);
    }
}
