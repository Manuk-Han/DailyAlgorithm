/******************************************
 2022-04-22 (Fri)
 번호 : 4673
 문제 : 셀프 넘버
 ******************************************/


import java.util.*;

public class No4673s5{
    public static void main(String[] args) {

        List list = new ArrayList();

        for(int i= 1 ; i <= 10000 ; i++) list.add(i);

        for(int j = 1 ; j <= 10000 ; j++)
            list.remove(Integer.valueOf(j + j%10 + (j/10) % 10 + (j/100) % 10 + (j/1000) % 10));

        StringBuilder sb = new StringBuilder();
        for(Object k:list) sb.append(k+"\n");

        System.out.println(sb);
    }
}