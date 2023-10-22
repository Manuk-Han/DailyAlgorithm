import java.util.*;

public class No1092g5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> crane = new ArrayList<>(), box = new ArrayList<>();
        for(int i = scanner.nextInt() ; i > 0 ; i--) crane.add(scanner.nextInt());
        for(int i = scanner.nextInt() ; i > 0 ; i--) box.add(scanner.nextInt());

        crane.sort(Collections.reverseOrder());
        box.sort(Collections.reverseOrder());

        if(box.get(0) > crane.get(0)) {
            System.out.println(-1);
            return;
        }

        int time = 0;

        while(!box.isEmpty()) {
            int index = 0;

            for(int i = 0 ; i < crane.size() ; ) {
                if(index == box.size()) break;
                else if(crane.get(i) >= box.get(index)) {
                    box.remove(index);
                    i++;
                }
                else index++;
            }

            time++;
        }

        System.out.println(time);
    }
}