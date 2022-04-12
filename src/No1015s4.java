/******************************************
 2022-04-12 (Thu)
 번호 : 1015
 문제 : 수열 정렬
 ******************************************/

import java.util.Arrays;
import java.util.Scanner;

public class No1015s4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arraySize = scanner.nextInt(); //배열 크기 입력
        int[] array = new int[arraySize], sortedArray = new int[arraySize]; // 입력 그대로 배열, 정렬할 배열 생성

        for( int i = 0 ; i < arraySize ; i++ ){
            int input = scanner.nextInt();
            array[i] = sortedArray[i] =  input;
        }

        Arrays.sort(sortedArray);

        int[] arrayP = new int[arraySize];
        for( int i = 0 ; i < arraySize ; i++ ){ // 정렬한 배열값과 원상태의 배열의 값이 일치하면 수열 P에 정렬한 배열의 인덱스 삽입
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

//TODO : 맵으로 처리가 가능해 보임