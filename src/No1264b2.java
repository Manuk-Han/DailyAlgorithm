/******************************************
 2022-04-16 (Sat)
 번호 : 1264
 문제 : 모음의 개수
 ******************************************/

import java.util.*;

public class No1264b2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arr = {"a", "e", "i", "o", "u", "A", "E", "I", "O", "U"};

        while(true){
            String input = scanner.nextLine();
            if(input.equals("#")) return;

            int n = 0;
            for(int i = 0 ; i < input.length() ; i++)
                if(Arrays.asList(arr).contains(input.charAt(i)+"")) n++;

            System.out.println(n);
        }
    }
}
