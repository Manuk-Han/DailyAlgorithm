import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class No2238s5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int u = Integer.parseInt(st.nextToken()), n = Integer.parseInt(st.nextToken());

        Map<Integer, ArrayList<String>> map = new HashMap<>();

        for(int i = 0 ; i < n ; i++){
            st = new StringTokenizer(br.readLine(), " ");
            String value = st.nextToken();
            int key = Integer.parseInt(st.nextToken());

            if(map.get(key) == null){
                ArrayList<String> list = new ArrayList<>();
                list.add(value);
                map.put(key, list);
            }
            else{
                ArrayList<String> list = map.get(key);
                list.add(value);
                map.put(key, list);
            }
        }

        int min = n;
        String name = "";
        for(int k : map.keySet()){
            if(k < min && map.get(k).size() == 1){
                min = k;
                name = map.get(k).get(0);
            }
        }
        System.out.print(name + " " + min);
    }
}
