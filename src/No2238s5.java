import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class No2238s5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int u = Integer.parseInt(st.nextToken()), n = Integer.parseInt(st.nextToken());

        Map<Integer, String> map = new HashMap<>();
        int [] arr = new int[u+1];

        for(int i = 0 ; i < n ; i++){
            st = new StringTokenizer(br.readLine(), " ");
            String name = st.nextToken();
            int price = Integer.parseInt(st.nextToken());

            arr[price]++;

            if(!map.containsKey(price)){
                map.put(price, name);
            }
        }

        int min = n, minPrice = 0;
        for(int i = u ; i > 0 ; i--){
            if(arr[i] != 0 && arr[i] <= min){
                min = arr[i];
                minPrice = i;
            }
        }

        System.out.println(map.get(minPrice) + " " + minPrice);
    }
}

