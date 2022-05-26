/******************************************
 2022-05-26 (Thu)
 번호 : 2346
 문제 : 풍선 터트리기
 ******************************************/

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class No2346s3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();

        int N = scanner.nextInt(), array[] = new int[N];

        for(int i = 0 ; i < N ; i++){
            deque.add(i+1);
            array[i] = scanner.nextInt();
        }

        int now = 0;
        for(int i = 0 ; i < N-1 ; i++){
            System.out.print(deque.poll() + " ");
            if(array[now] > 0){
                for(int j = 0 ; j < array[now]-1 ; j++)
                    deque.addLast(deque.pollFirst());
            }
            else{
                for(int j = 0 ; j < Math.abs(array[now]) ; j++)
                    deque.addFirst(deque.pollLast());
            }
            now = deque.peek()-1;
        }
        System.out.print(deque.poll());
    }
}
