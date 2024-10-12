import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class No1755s4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = { 100, 50, 90, 80, 30, 20, 70, 60, 10, 40 };

        Map<Integer, Integer> map = new HashMap<>();

        int M = scanner.nextInt(), N = scanner.nextInt();

        for(int i = M ; i <= N ; i++)
            map.put(i < 10 ? arr[i]*100 : arr[i/10]*100 + arr[i%10], i);

        AtomicInteger count = new AtomicInteger();
        map.keySet().stream()
                .sorted()
                .forEach(key -> {
                    System.out.print(map.get(key) + " ");
                    if (count.incrementAndGet() % 10 == 0) {
                        System.out.println();
                    }
                });
    }
}
