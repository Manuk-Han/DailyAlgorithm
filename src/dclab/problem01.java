/**
 알고리즘 1

 DCLab의 연구원들은 각자 많은 분야에 관심이있다. 어느날 랩장 신민철은 연구원들이 어떤 분야에 가장 관심이 있나 궁금해졌다.연구원 각각이 관심 분야들을 입력하고, 가장 관심도가 높은 분야와 관심이 있는 연구원들을 알려주는 프로그램을 작성해보자.
 조건:
 1. 첫줄에 입력 N을 받아 N명 만큼 사람의 이름과 관심 분야들을 입력받는다. ( N은 3이상 20 이하의 자연수, 각 사람 별 관심 분야의 수는 1이상 20 이하)
 2. 이름과 분야는 공백으로 구분한다.
 3. 가장 관심이 높은 분야가 여러 개라면 입력 받은 분야 순으로 정렬하여 출력한다.
 4. 관심 연구원은 먼저 입력한 순으로 정렬한다.

 입력 예시 1
 5
 신민철 인공지능 백엔드
 이진성 보안 인공지능
 김현무 보안 인공지능
 김선민 인공지능 빅데이터 백엔드
 한만욱 백엔드 프론트엔드

 출력 예시 1
 인공지능 : 신민철, 이진성, 김현무, 김선민



 입력 예시 2
 8
 신민철 인공지능 백엔드
 이진성 보안 인공지능
 김현무 보안 인공지능
 김선민 인공지능 빅데이터 백엔드
 한만욱 백엔드 프론트엔드
 이푸름 안드로이드
 이혜인 프론트엔드 백엔드
 유혜인 안드로이드 프론트엔드

 출력 예시 2
 인공지능 : 신민철, 이진성, 김현무, 김선민
 백엔드 : 신민철, 김선민, 한만욱, 이혜인

 */


package dclab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class problem01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Map<String, List<String>> map = new HashMap<>();

        List<String> fieldList = new ArrayList<>();

        for(int i = 0 ; i < n ; i++) {
            String inputArr[] = br.readLine().split(" ");

            for(int j = 1 ; j < inputArr.length ; j++) {
                if(map.get(inputArr[j]) == null) {
                    fieldList.add(inputArr[j]);
                    map.put(inputArr[j], new ArrayList<>());
                }

                List<String> field = map.get(inputArr[j]);
                field.add(inputArr[0]);

                map.put(inputArr[j], field);
            }
        }

        int max = 0;

        for(String key : fieldList)
            max = Math.max(max, map.get(key).size());


        for(String key : fieldList){
            List<String> students = map.get(key);

            if(students.size() == max){
                String output = key + " : ";

                for(String student : students)
                    output += (student + ", ");

                System.out.println(output.substring(0, output.length()-2));
            }
        }
    }
}
