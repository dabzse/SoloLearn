import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int houses = input.nextInt();

        // your code goes here
        double value = 2 * 100.0 / houses;
        System.out.println((int)Math.ceil(value));
    }
}