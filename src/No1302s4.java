/******************************************
 2022-04-17 (Sun)
 번호 : 1302
 문제 : 베스트세러
 ******************************************/

import java.util.*;

public class No1302s4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();

        int n = scanner.nextInt();

        for(int i = 0 ; i < n ; i++){
            String book = scanner.next();

            if(map.get(book) != null) map.put(book, map.get(book)+1);
            else map.put(book, 1);
        }

        Object[] key = map.keySet().toArray();
        Arrays.sort(key);

        int max = 0;
        String bestSeller = "";
        for(Object book : key){
            if(map.get(book) > max){
                max = map.get(book);
                bestSeller = (String)book;
            }
        }

        System.out.print(bestSeller);
    }
}
