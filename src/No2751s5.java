import java.io.*;
import java.util.TreeSet;

public class No2751s5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        TreeSet<Integer> set = new TreeSet<>();

        for(int i = 0 ; i < n ; i++) set.add(Integer.parseInt(br.readLine()));

        StringBuilder sb = new StringBuilder();
        for(int i : set) sb.append(i+"\n");

        bw.write(String.valueOf(sb));
        bw.flush();
    }
}
