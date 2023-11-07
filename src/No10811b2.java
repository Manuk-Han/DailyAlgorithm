import java.util.Scanner;

public class No10811b2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int num = scanner.nextInt();
        int[] now = new int[size];

        for(int i = 0 ; i < size ; i++) now[i] = i+1;

        for(int i = 0 ; i < num ; i++){
           int input1 = scanner.nextInt()-1, input2 = scanner.nextInt()-1;

           while(input1 <= input2){
               int temp = now[input1];
               now[input1++] = now[input2];
               now[input2--] = temp;
           }
        }

        String output = "";
        for(int i : now) output += i+" ";

        System.out.println(output);
    }
}
