import java.io.*;

public class No1427s5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine(), output = "";
        int []arr = new int[10];

        for(char c : input.toCharArray()) arr[c-'0']++;

        for(int i = 9 ; i >= 0 ; i--)
            bw.write((i+"").repeat(arr[i]));

        bw.flush();
    }
}

