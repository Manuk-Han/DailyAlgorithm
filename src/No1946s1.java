import java.util.Arrays;
import java.util.Scanner;

public class No1946s1 {
    public static void main(String[] args) {
        int originArr[][] = new int[][]{{0,2,1,3},{1,2,2,5},{3,3,4,4},{4,1,6,3},{1,6,5,7},{5,5,7,6},{5,8,6,10}};
        int arr[][] = new int[originArr.length][5];

        for(int i = 0 ; i < originArr.length ; i++){
            for(int j = 0 ; j < 4 ; j++) arr[i][j] = originArr[i][j];
            arr[i][4] = i;
        }

        int[] index = new int[arr.length];
        for(int i = 0 ; i < arr.length ; i++) index[i] = i;

        int maxX = 0, maxY = 0;
        for(int i = 0; i < arr.length ;i++){
            maxX = Math.max(maxX, arr[i][2]);
            maxY = Math.max(maxY, arr[i][3]);
        }

        Arrays.sort(arr, (o1, o2) -> {
            return o1[1]-o2[1];
        });

        int arrX[] = new int[maxX+1];
        for(int i = 0 ; i < arr.length ; i++){
            int max = 0;
            for(int x = arr[i][0]+1 ; x <= arr[i][2] ; x++) max = Math.max(max, arrX[x]);
            for(int x = arr[i][0]+1 ; x <= arr[i][2] ; x++) arrX[x] = max+arr[i][3]-arr[i][1];

            arr[i] = new int[]{arr[i][0], max, arr[i][2], arrX[arr[i][2]], arr[i][4]};
        }

        Arrays.sort(arr, (o1, o2) -> {
            return o1[0]-o2[0];
        });

        int arrY[] = new int[maxY+1];
        for(int i = 0 ; i < arr.length ; i++){
            int max = 0;
            for(int x = arr[i][1]+1 ; x <= arr[i][3] ; x++) max = Math.max(max, arrY[x]);
            for(int x = arr[i][1]+1 ; x <= arr[i][3] ; x++) arrY[x] = max+arr[i][2]-arr[i][0];

            arr[i] = new int[]{max, arr[i][1], arrY[arr[i][3]], arr[i][3], arr[i][4]};
        }

        Arrays.sort(arr, (o1, o2) -> {
            return o1[4]-o2[4];
        });

        System.out.println();
    }
}
