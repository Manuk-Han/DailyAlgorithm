import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No1965s2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[1001];
        int result = 0;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        while (st.hasMoreTokens()) {
            int inputInt = Integer.parseInt(st.nextToken());

            int max = 0;

            for(int j = 1 ; j < inputInt ; j++) {
                if(arr[j] == j) {
                    max = j;
                    break;
                }
                if (arr[j] > max)
                    max = arr[j];
            }

            arr[inputInt] = max + 1;
            result = Math.max(result, arr[inputInt]);
        }

        System.out.println(result);
    }
}
