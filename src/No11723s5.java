import java.util.Objects;
import java.util.Scanner;

public class No11723s5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        boolean arr[] = new boolean[20];

        String command = "";
        int value = 0;

        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i < n ; i++){

            String input = scanner.nextLine();

            if(Objects.equals(input, "all") || Objects.equals(input, "empty")){
                command = input;
            } else {
                command = input.split(" ")[0];
                value = Integer.parseInt(input.split(" ")[1]) - 1;
            }

            switch (command){
                case "add" :
                    arr[value] = true;
                    break;
                case "remove" :
                    arr[value] = false;
                    break;
                case "check" :
                    sb.append(arr[value] ? 1 : 0);
                    sb.append("\n");
                    break;
                case "toggle" :
                    arr[value] = !arr[value];
                    break;
                case "all" :
                    for (int j = 0 ; j < 20 ; j++) arr[j] = true;
                    break;
                case "empty" :
                    for (int j = 0 ; j < 20 ; j++) arr[j] = false;
                    break;
            }
        }

        System.out.println(sb);
    }
}
