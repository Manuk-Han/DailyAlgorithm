import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int sequence[] = {1,2,3,4,5}, k = 7;

        int[] answer = {0,0};

        Arrays.sort(sequence);

        int index = sequence.length-1;

        while(k < sequence[index]) index--;
    }
}

