import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        // your code goes here
        Scanner scanner = new Scanner(System.in);
        String box = scanner.next();
        switch (box) {
            case "red":
                System.out.println(1);
                break;
            case "green":
                System.out.println(2);
                break;
            case "black":
                System.out.println(3);
                break;
        }
    }
}