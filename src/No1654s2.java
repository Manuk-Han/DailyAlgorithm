import java.io.*;
import java.util.Arrays;

public class No1654s2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String input[] = br.readLine().split(" ");
        int K = Integer.parseInt(input[0]), N = Integer.parseInt(input[1]);

        int lan[] = new int[1000001];
        for(int i = 0 ; i < K ; i++)
            lan[i] = Integer.parseInt(br.readLine());

        Arrays.sort(lan);

        for(int i = K-1 ; i >= 0 ; i--){
            for(int j = 2 ; ; j++){

            }
        }
    }
}
