import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class No18111s2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
        int arr[] = new int[257], sum = 0;

        int start = 256, end = 0;
        for(int i = 0 ; i < n ; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for(int j = 0 ; j < m ; j++) {
                int num = Integer.parseInt(st.nextToken());
                start = Math.min(start, num);
                end = Math.max(end, num);
                arr[num]++;
                sum += num;
            }
        }

        int min = Integer.MAX_VALUE, height = 0;
        int minus = sum, plus = 0, low = 0, high = 0;

        for(int i = start ; i < end+1 ; i++) {
            if(plus - minus <= b){
                if(min >= plus + minus*2) {
                    min = plus + minus*2;
                    height = i;
                }
            }
            low += arr[i];
            plus += low;

            high += arr[i];
            minus -= n*m - high;
        }

        bw.write(min + " " + height);
        bw.flush();
    }
}
