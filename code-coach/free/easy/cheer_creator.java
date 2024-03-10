import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int yard = Integer.parseInt(input.nextLine());
        if (yard > 10) {
            System.out.println("High Five");
        } else if (yard < 1) {
            System.out.println("shh");
        } else {
            for (int i = 0; i < yard; i++) {
                System.out.print("Ra!");
            }
        }
    }
}