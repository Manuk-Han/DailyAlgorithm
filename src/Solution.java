import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int []height = {140, 21, 21, 32};
        int []width = {2, 1, 3, 7};

        int []arr = new int[10000001];

        int hMax = 0;
        for(int i = 0 ; i < height.length ; i++) {
            arr[height[i]] += width[i];
            hMax = Math.max(hMax, height[i]);
        }

        int max = 0, w = 0;

        for(int i = hMax ; i >= 0 ; i--){
            if(!(arr[i] == 0)){
                w += arr[i];
                max = Math.max(max, w*i);
            }
        }

        System.out.println(max);
    }
}

