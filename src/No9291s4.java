import java.io.*;

public class No9291s4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < T ; i++){
            boolean flag = false;

            boolean [][]line = new boolean[9][9];
            boolean [][]box = new boolean[9][9];
            for(int j = 0 ; j < 9 ; j++){
                if(flag) {
                    br.readLine();
                    continue;
                }

                boolean []row = new boolean[9];

                String p = br.readLine();

                for(int k = 0 ; k < 9 ; k++){
                    int input = p.charAt(k*2) - '1';
                    if(row[input] || line[k][input] || box[k/3+(j/3)*3][input]) {
                        flag = true;
                        break;
                    }
                    row[input] = true;
                    line[k][input] = true;
                    box[k/3+(j/3)*3][input] = true;
                }
            }
            if(i != T-1)
                br.readLine();

            bw.write("Case " + (i+1) + ": ");
            bw.write(flag ? "INCORRECT\n" : "CORRECT\n");
        }

        bw.flush();
    }
}
