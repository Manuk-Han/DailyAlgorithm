import java.util.Arrays;
import java.util.Scanner;

public class No1015s4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize], sortedArray = new int[arraySize];

        for( int i = 0 ; i < arraySize ; i++ ){
            int input = scanner.nextInt();
            array[i] = sortedArray[i] =  input;
        }

        Arrays.sort(sortedArray);

        int[] arrayP = new int[arraySize];
        for( int i = 0 ; i < arraySize ; i++ ){
            for ( int j = 0 ; j < arraySize ; j++ ){
                if(sortedArray[i] == array[j]){
                    array[j] = 0;
                    arrayP[j] = i;
                    break;
                }
            }
        }

        for( int i : arrayP) System.out.print(i + " ");
    }
}
