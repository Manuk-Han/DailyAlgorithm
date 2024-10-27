import java.util.Scanner;

public class No1063s3 {
    public static void main(String[] args) {
        int kingX = 0, kingY = 0, stoneX = 0, stoneY = 0;

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        kingX = input.split(" ")[0].charAt(0) - 'A';
        kingY = input.split(" ")[0].charAt(1) - '1';

        stoneX = input.split(" ")[1].charAt(0) - 'A';
        stoneY = input.split(" ")[1].charAt(1) - '1';

        for(int i = Integer.parseInt(input.split(" ")[2]) ; i > 0 ; i--) {
            String move = scanner.nextLine();

            int dx = 0, dy = 0;

            if(move.equals("R")) dx = 1;
            else if(move.equals("L")) dx = -1;
            else if(move.equals("B")) dy = -1;
            else if(move.equals("T")) dy = 1;
            else if(move.equals("RT")) { dx = 1; dy = 1; }
            else if(move.equals("LT")) { dx = -1; dy = 1; }
            else if(move.equals("RB")) { dx = 1; dy = -1; }
            else if(move.equals("LB")) { dx = -1; dy = -1; }

            int nextKingX = kingX + dx;
            int nextKingY = kingY + dy;

            if(nextKingX < 0 || nextKingX >= 8 || nextKingY < 0 || nextKingY >= 8) continue;

            if(nextKingX == stoneX && nextKingY == stoneY) {
                int nextStoneX = stoneX + dx;
                int nextStoneY = stoneY + dy;

                if(nextStoneX < 0 || nextStoneX >= 8 || nextStoneY < 0 || nextStoneY >= 8) continue;

                kingX = nextKingX;
                kingY = nextKingY;
                stoneX = nextStoneX;
                stoneY = nextStoneY;
            } else {
                kingX = nextKingX;
                kingY = nextKingY;
            }
        }

        System.out.println((char)(kingX + 'A') + "" + (char)(kingY + '1'));
        System.out.println((char)(stoneX + 'A') + "" + (char)(stoneY + '1'));
    }
}
