import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No2559s3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        int sum = 0;

        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0 ; i < n ; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if(i < k) sum += arr[i];
        }

        int max = sum;

        for (int i = 0 ; i < n-k ; i++) {
            sum += (arr[i+k] - arr[i]);
            max = Math.max(max, sum);
        }

        System.out.println(max);
    }
}
