import java.util.*;

public class No8979s5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(), K = scanner.nextInt();
        HashMap<Integer, Integer> gold = new HashMap<>();
        HashMap<Integer, Integer> silver = new HashMap<>();
        HashMap<Integer, Integer> bronze = new HashMap<>();

        for(int i = 0 ; i < N ; i++){
            int country = scanner.nextInt();

            gold.put(country, scanner.nextInt());
            silver.put(country, scanner.nextInt());
            bronze.put(country, scanner.nextInt());
        }

        int rank = 1;
        int[] winner = new int[N];

        for(int i = 1 ; i <= N ; i++) {
            if(gold.get(i) > gold.get(K)) winner[i-1] = 2;
            if(gold.get(i) == gold.get(K)) winner[i-1] = 1;
        }

        for(int i = 1 ; i <= N ; i++){
            if(winner[i-1] != 1) continue;
            if(silver.get(i) > silver.get(K)) winner[i-1] = 2;
            else if(silver.get(i) == silver.get(K)) winner[i-1] = 1;
            else winner[i-1] = 0;
        }

        for(int i = 1 ; i <= N ; i++) {
            if(winner[i-1] != 1) continue;
            if(winner[i-1] == 1 & bronze.get(i) > bronze.get(K)) winner[i-1] = 2;
        }

        for(int i = 0 ; i < N ; i++) if(winner[i] == 2) rank++;
        System.out.print(rank);
    }
}
