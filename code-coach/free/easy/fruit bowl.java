import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int fruit = input.nextInt();

        // your code goes here
        int apple = fruit / 2;
        int pie = apple / 3;

        System.out.println(pie);
    }
}