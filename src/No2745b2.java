public class No2745b2 {
    public static void main(String[] args) {
        String input = new java.util.Scanner(System.in).nextLine(), text = input.split(" ")[0];
        int num = Integer.parseInt(input.split(" ")[1]), sum = 0, index = 1;

        for(char now : text.toCharArray())
            sum += (int)Math.pow(num, text.length()-index++) * ((now>='0' && now<='9') ? now-'0' : now-'A'+10);

        System.out.print(sum);
    }
}
