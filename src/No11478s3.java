/******************************************
 2022-05-09 (Mon)
 번호 : 11478
 문제 : 서로 다른 부분 문자열의 개수
 ******************************************/

import java.util.HashMap;
import java.util.Scanner;

public class No11478s3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int length = input.length();

        HashMap<String, Boolean> map = new HashMap<>();

        for(int i = 0 ; i <= length ; i++){
            for(int j = 0 ; i+j <= length ; j++)
                map.put(input.substring(i, i+j), true);
        }

        System.out.print(map.size()-1);
    }
}
