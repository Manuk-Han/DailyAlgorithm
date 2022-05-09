/******************************************
 2022-05-09 (Mon)
 번호 : 10815
 문제 : 숫자 카드
 ******************************************/

import java.util.HashMap;
import java.util.Scanner;

public class No10815s4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        HashMap<Integer, Boolean> map = new HashMap<>();
        for(int i = 0 ; i < N ; i++)
            map.put(scanner.nextInt(), true);

        int M = scanner.nextInt();
        for(int i = 0 ; i < M ; i++)
            System.out.print((map.get(scanner.nextInt()) == null ? 0 : 1) + " ");
    }
}
