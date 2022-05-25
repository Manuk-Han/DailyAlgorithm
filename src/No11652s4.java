import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class No11652s4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String,Integer> map = new HashMap<>();

        int n = Integer.parseInt(br.readLine()), max = 0;
        String value = "";

        for(int i = 0 ; i < n ; i++){
            String input = br.readLine();

            map.merge(input, 1, Integer::sum);

            if(map.get(input) == max){
                BigInteger big1 = new BigInteger(input);
                BigInteger big2 = new BigInteger(value);
                if(big1.compareTo(big2) < 0) value = input;
            }
            if(map.get(input) > max){
                max = map.get(input);
                value = input;
            }
        }

        System.out.print(value);
    }
}
