import java.util.Scanner;

public class No1673 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int n = scanner.nextInt(), k = scanner.nextInt(), chicken = n;

            while (n / k > 0) {
                chicken += n / k;
                n = n / k + n % k;
            }

            System.out.println(chicken);
        }
    }
}
