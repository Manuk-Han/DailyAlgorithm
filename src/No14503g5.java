import java.util.Scanner;

public class No14503g5 {
    static int x, y, direction, cleaned = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(), m = scanner.nextInt();
        cleaned = n * m;

        int [][] map = new int[n][m];

        y = scanner.nextInt();
        x = scanner.nextInt();
        direction = scanner.nextInt();

        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++) {
                map[i][j] = scanner.nextInt();

                if(map[i][j] == 0)
                    cleaned--;
            }
        }

        int clean = 0;

        int num = 0, nowX = -1, nowY = -1;
        while(cleaned < n * m) {
            if(x == -1 || x == m || y == -1 || y == n) {
                System.out.println(clean);
                return;
            }

            if(x == nowX && y == nowY) {
                direction = (direction+3) % 4;

                if(num == 5) {
                    back(direction);

                    if(map[y][x] == 1) {
                        System.out.println(clean);
                        return;
                    }

                    nowX = x;
                    nowY = y;

                    continue;
                }

                go(direction);
                num++;

                continue;
            }

            if(map[y][x] == 0) {
                clean++;
                map[y][x] = 2;
                cleaned++;
                nowX = x;
                nowY = y;

                go(direction);
                num = 0;
            } else {
                back(direction);
                clean++;
            }
        }

        System.out.println(clean);
    }

    static void go(int direction) {
        switch (direction) {
            case 0 -> y--;
            case 1 -> x++;
            case 2 -> y++;
            default -> x--;
        }
    }

    static void back(int direction) {
        switch (direction) {
            case 0 -> y++;
            case 1 -> x--;
            case 2 -> y--;
            default -> x++;
        }
    }
}
