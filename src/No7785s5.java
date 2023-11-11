import java.util.*;

public class No7785s5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        Set<String> list = new TreeSet<>();

        for(int i = 0 ; i < n ; i++) {
            String input = scanner.next();
            scanner.next();

            if(list.contains(input)) list.remove(input);
            else list.add(input);
        }

        String[] nameList = new String[list.size()];

        int m = 0;
        for(String name : list) nameList[m++] = name;

        for(int i = m ; i > 0 ; i--) System.out.println(nameList[i-1]);
    }
}
