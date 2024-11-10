public class No1075b2 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        int N = scanner.nextInt();
        int F = scanner.nextInt();

        N = N / 100 * 100;

        for(int i = 0; i < 100; i++) {
            if(N % F == 0) {
                if(N % 100 < 10)
                    System.out.printf("%02d" , N % 100);
                else
                    System.out.println(N % 100);
                break;
            }
            N++;
        }
    }
}
