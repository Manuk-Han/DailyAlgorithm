/******************************************
 2022-05-09 (Mon)
 번호 : 1269
 문제 : 대칭 차집합
 ******************************************/

import java.util.HashMap;
import java.util.Scanner;

public class No1269s3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(), M = scanner.nextInt();
        HashMap<Integer, Boolean> map = new HashMap<>();

        for(int i = 0 ; i < N+M ; i++)
            map.put(scanner.nextInt(), true);

        System.out.println(2*map.size() - (N+M));
    }
}
