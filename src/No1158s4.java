/******************************************
 2022-04-15 (Fri)
 번호 : 1158
 문제 : 요세푸스 문제
 ******************************************/

import java.util.*;

public class No1158s4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(), K = scanner.nextInt();

        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0 ; i < N ; i++) queue.add(i+1);

        String perm = "<";
        while(queue.size() != 0){
            for(int i = 0 ; i < K-1 ; i++) queue.add(queue.poll());
            perm += queue.poll() + ", ";
        }
        perm = perm.substring(0, perm.length()-2);

        System.out.print(perm + ">");
    }
}
