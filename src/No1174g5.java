import java.io.*;
import java.util.*;

public class No1174g5 {
    static Map<Integer, Long> map = new HashMap<>();
    static int N;
    static int[] result;
    static Stack<Long> stack;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        for(int i = 1; i <= 10; i++){
            map.put(i, (long)(i - 1));
        }
        int start = 11;
        for(int i = 2; i <= 10; i++){
            //i : 자리수

            result = new int[i];
            stack = new Stack<>();
            recursive(i, 0, 9);

            while(!stack.isEmpty())
                map.put(start++, stack.pop());
        }
        if(N > map.size()){
            System.out.println(-1);
        }else{
            System.out.println(map.get(N));
        }
    }
    static void recursive(int M, int m, int start){
        if(m == M){
            StringBuilder sb = new StringBuilder();
            for (int i : result) {
                sb.append(i);
            }
            stack.push(Long.parseLong(sb.toString()));

            return;
        }
        for(int i = start; i >= 0; i--){
            result[m] = i;
            recursive(M, m + 1, i - 1);
        }

    }
}
