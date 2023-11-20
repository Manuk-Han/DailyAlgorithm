import java.util.Scanner;

public class No2491s4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int globalMinCount = 1, globalMaxCount = 1, localMinCount = 1, localMaxCount = 1, min, max;
        min = max = scanner.nextInt();

        for(int i = 0 ; i < num-1 ; i++){
            int input = scanner.nextInt();

            localMinCount = input > min ? 1 : localMinCount+1;
            globalMinCount = Math.max(globalMinCount, localMinCount);
            min = input;

            localMaxCount = input < max ? 1 : localMaxCount+1;
            globalMaxCount = Math.max(globalMaxCount, localMaxCount);
            max = input;
        }

        System.out.println(Math.max(globalMinCount, globalMaxCount));
    }
}
