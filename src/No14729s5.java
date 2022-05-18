/******************************************
 2022-05-18 (Wed)
 번호 : 14729
 문제 : 칠무해
 ******************************************/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No14729s5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int score[] = new int[100001], N = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < N ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), ".");
            int sc = Integer.parseInt(st.nextToken() + st.nextToken());
            score[sc]++;
        };

        for(int i = 0, j = 0 ; j < 7 ; i++){
            for(int k = 0 ; k < score[i] && j < 7 ; k++){
                if(j < 6) System.out.println(String.format("%.3f", (double)i/1000.0));
                else System.out.print(String.format("%.3f", (double)i/1000.0));
                j++;
            }
        }
    }
}
