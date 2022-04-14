/******************************************
 번호 : 1003
 문제 : 피보나치 함수
 ******************************************/

import java.io.*;

public class No1003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        for(int i=Integer.parseInt(br.readLine());i>0;i--) {
            int a=1,b=0,n=Integer.parseInt(br.readLine());
            for(int j=n;j>0;j--) {
                int c=b,d=a+b;
                a=c;
                b=d;
            }
            bw.write(a+" "+b+"\n");
        }
        bw.close();
    }
}
